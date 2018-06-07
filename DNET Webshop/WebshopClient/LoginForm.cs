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
    public partial class LoginForm : Form
    {
        private IWebshopService client;
        public LoginForm()
        {
            client = new WebshopServiceClient();
            InitializeComponent();
        }

        private void LoginForm_Load(object sender, EventArgs e)
        {

        }

        private void registerButton_Click(object sender, EventArgs e)
        {
            // Hide messages
            registerErrorLabel.Visible = false;
            registerPasswordLabel.Visible = false;

            string username = registerUsernameTextBox.Text;

            // Reverse username as password
            char[] charArray = username.ToCharArray();
            Array.Reverse(charArray);
            string password = new string(charArray);

            // Insert customer
            if (client.InsertCustomer(username, password))
            {
                // On success show new password
                registerPasswordLabel.Text = $"Your password: {password}";
                registerPasswordLabel.Visible = true;
            }
            // If unavailable show error message
            else registerErrorLabel.Visible = true;
        }

        private void loginButton_Click(object sender, EventArgs e)
        {
            // Hide message
            loginErrorLabel.Visible = false;

            string username = loginUsernameTextBox.Text;
            string password = loginPasswordTextBox.Text;

            // Get customer info with entered username/password combination
            Customer customer = client.GetCustomer(username, password);
            if (customer == null)
                loginErrorLabel.Visible = true;
            else
            {
                WebshopForm webshopForm = new WebshopForm(this, customer);
                this.Hide();
                webshopForm.Show();
            }

        }
    }
}
