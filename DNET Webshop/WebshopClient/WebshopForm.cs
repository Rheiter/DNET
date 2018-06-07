using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using WebshopClient.ServiceReference;

namespace WebshopClient
{
    public partial class WebshopForm : Form
    {
        private Customer customer;
        private LoginForm loginForm;
        private IWebshopService client;

        public WebshopForm(LoginForm loginForm, Customer customer)
        {
            this.client = new WebshopServiceClient();
            this.loginForm = loginForm;
            this.customer = customer;

            InitializeComponent();
            
            // Set title
            this.Name += $" - logged in as {customer.Username}";

            // Set money
            moneyLabel.Text += customer.Credit;

            // Set shop inventory
            RefreshAll();
        }

        private void shopListBox_SelectedIndexChanged(object sender, EventArgs e)
        {
            ListBox lb = (ListBox)sender;
        }

        private void logoutButton_Click(object sender, EventArgs e)
        {
            this.Close();
            loginForm.Show();
        }

        private void buyButton_Click(object sender, EventArgs e)
        {
            // Hide message
            messageLabel.Hide();

            try
            {
                Product product = (Product)shopListBox.SelectedValue;
                if (product == null)
                {
                    messageLabel.Text = "No product selected!";
                    messageLabel.Show();
                    return;
                }

                // Buy product
                messageLabel.Text = client.Buy(product, customer);
                messageLabel.Show();
            }
            catch (Exception exception)
            {
                System.Diagnostics.Debug.WriteLine(exception.Message);
                messageLabel.Text = "Oops! Something went wrong!";
            }
            RefreshAll();
        }

        private void refreshButton_Click(object sender, EventArgs e)
        {
            RefreshAll(true);
        }

        private void ownListBox_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void RefreshAll(bool refreshButtonPressed = false)
        {
            // Hide messages
            if (refreshButtonPressed)
            {
                messageLabel.Hide();
            }

            // Refresh shop inventory
            Product[] products = client.GetProducts();

            // Get name from selected item before refresh
            string selectedName = "";
            if (shopListBox.ValueMember != null) {
                var selected = shopListBox.SelectedValue;
                if(selected != null)
                {
                    Product selectedProduct = (Product)selected;
                    selectedName = selectedProduct.Name;
                }
                
            }

            // refresh list
            if (products.Length > 0)
            {
                var labels = from p in products
                             select $"{p.Name}: €{p.Price} - {p.Qnty} in stock";

                var dict = products.Zip(labels.ToArray(), (p, s) => new { p, s })
                              .ToDictionary(item => item.p, item => item.s);

                shopListBox.DataSource = new BindingSource(dict, null);
                shopListBox.DisplayMember = "Value";
                shopListBox.ValueMember = "Key";
            }
            else
            {
                shopListBox.DataSource = null;
                shopListBox.DisplayMember = null;
                shopListBox.ValueMember = null;
            }

            // Select last selected item if still available
            if (!String.IsNullOrEmpty(selectedName))
            {
                for (int i = 0; i < shopListBox.Items.Count; i++)
                {
                    KeyValuePair<Product, string> item = (KeyValuePair<Product, string>)shopListBox.Items[i];
                    if (item.Key.Name == selectedName)
                        shopListBox.SelectedIndex = i;
                }
            }

            // Refresh customer inventory
            products = client.GetCart(customer);
            if (products.Length > 0)
            {
                var labels = from p in products
                         select $"{p.Name}, owned: {p.Qnty}";

                 var dict = products.Zip(labels.ToArray(), (p, s) => new { p, s })
                          .ToDictionary(item => item.p, item => item.s);

                ownListBox.DataSource = new BindingSource(dict, null);
                ownListBox.DisplayMember = "Value";
                ownListBox.ValueMember = "Key";
            }

            // MoneyLabel
            customer.Credit = client.GetCredit(customer);
            moneyLabel.Text = $"Money left: €{customer.Credit}";

        }
    }
}
