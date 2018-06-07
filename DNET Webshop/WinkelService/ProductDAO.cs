using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using WebshopService;

namespace Data
{
    class ProductDAO
    {
        public List<Product> GetAllProducts()
        {
            List<Product> result = new List<Product>();

            string query = "SELECT * FROM product WHERE qnty > 0";

            try
            {
                // Open connection
                using (MySqlConnection conn = DBConnection.Instance().Connection)
                {
                    // Open connection
                    conn.Open();

                    MySqlCommand cmd = new MySqlCommand(query, conn);
                    
                    //Create a data reader and Execute the command
                    MySqlDataReader dataReader = cmd.ExecuteReader();

                    // Read the data and store them in the list
                    while (dataReader.Read())
                    {
                        Product p = new Product();
                        p.Name = dataReader.GetString("name");
                        p.Price = dataReader.GetDecimal("price");
                        p.Qnty = dataReader.GetInt32("qnty");

                        result.Add(p);
                    }

                    // Close Data Reader
                    dataReader.Close();

                    // Return products
                    return result;
                }
            }
            catch (Exception)
            {
                // Return products
                return result;
            }
        }

        public int GetQnty(Product product)
        {
            int qnty = 0;

            string query = $"SELECT qnty FROM product WHERE name = '{product.Name}'";

            try
            {
                // Open connection
                using (MySqlConnection conn = DBConnection.Instance().Connection)
                {
                    // Open connection
                    conn.Open();

                    MySqlCommand cmd = new MySqlCommand(query, conn);

                    //Create a data reader and Execute the command
                    MySqlDataReader dataReader = cmd.ExecuteReader();

                    // Read the data and store them in the list
                    
                    while (dataReader.Read())
                    {
                        qnty = dataReader.GetInt32("qnty");
                    }

                    // Close Data Reader
                    dataReader.Close();

                    // Return qnty
                    return qnty;
                }
            }
            catch (Exception)
            {
                // Return 0
                return qnty;
            }
        }

        public string Buy(Product product, Customer customer)
        {
            try
            {
                string query = $"UPDATE product SET qnty = qnty - 1 WHERE name = '{product.Name}'";

                // Open connection
                using (MySqlConnection conn = DBConnection.Instance().Connection)
                {
                    // Open connection
                    conn.Open();

                    MySqlCommand cmd = new MySqlCommand(query, conn);
                    
                    // Execute query
                    cmd.ExecuteNonQuery();

                    query = $"UPDATE customer SET credit = credit - {product.Price.ToString(CultureInfo.CreateSpecificCulture("en-GB"))} WHERE username = '{customer.Username}'";
                    System.Diagnostics.Debug.WriteLine(query);
                    cmd = new MySqlCommand(query, conn);

                    cmd.ExecuteNonQuery();
                }

                if (GetCartProduct(product, customer) == null)
                    InsertCart(product, customer);
                else
                    UpdateCart(product, customer);

                return "Thank you for your purchase!";
            }
            catch (Exception exception)
            {
                System.Diagnostics.Debug.WriteLine(exception.Message);
                return "Oops! Something went wrong!";
            }
        }

        public List<Product> GetCart(Customer customer)
        {
            List<Product> result = new List<Product>();

            string query = $"SELECT * FROM cart WHERE username = '{customer.Username}'";

            try
            {
                // Open connection
                using (MySqlConnection conn = DBConnection.Instance().Connection)
                {
                    // Open connection
                    conn.Open();

                    MySqlCommand cmd = new MySqlCommand(query, conn);

                    //Create a data reader and Execute the command
                    MySqlDataReader dataReader = cmd.ExecuteReader();

                    // Read the data and store them in the list
                    while (dataReader.Read())
                    {
                        Product p = new Product();
                        p.Name = dataReader.GetString("product_name");
                        p.Qnty = dataReader.GetInt32("qnty");

                        result.Add(p);
                    }

                    // Close Data Reader
                    dataReader.Close();

                    // Return products
                    return result;
                }
            }
            catch (Exception)
            {
                // Return products
                return result;
            }
        }

        public Product GetCartProduct(Product product, Customer customer)
        {
            Product result = null;

            string query = $"SELECT * FROM cart WHERE product_name = '{product.Name}' AND username = '{customer.Username}'";

            try
            {
                // Open connection
                using (MySqlConnection conn = DBConnection.Instance().Connection)
                {
                    // Open connection
                    conn.Open();

                    MySqlCommand cmd = new MySqlCommand(query, conn);

                    //Create a data reader and Execute the command
                    MySqlDataReader dataReader = cmd.ExecuteReader();

                    // Read the data and store them in the list
                    while (dataReader.Read())
                    {
                        result = new Product();
                        result.Name = dataReader.GetString("product_name");
                        result.Qnty = dataReader.GetInt32("qnty");
                    }

                    // Close Data Reader
                    dataReader.Close();

                    // Return product
                    return result;
                }
            }
            catch (Exception)
            {
                // Return products
                return result;
            }
        }

        public void InsertCart(Product product, Customer customer)
        {
            try
            {
                string query = $"INSERT INTO cart(product_name, username, qnty) VALUES ('{product.Name}', '{customer.Username}', 1)";

                // Open connection
                using (MySqlConnection conn = DBConnection.Instance().Connection)
                {
                    // Open connection
                    conn.Open();

                    MySqlCommand cmd = new MySqlCommand(query, conn);

                    // Execute query
                    cmd.ExecuteNonQuery();
                }
            }
            catch (Exception exception)
            {
                System.Diagnostics.Debug.WriteLine(exception);
            }
        }

        public void UpdateCart(Product product, Customer customer)
        {
            try
            {
                string query = $"UPDATE cart SET qnty = qnty + 1 WHERE product_name = '{product.Name}' AND username = '{customer.Username}'";

                // Open connection
                using (MySqlConnection conn = DBConnection.Instance().Connection)
                {
                    // Open connection
                    conn.Open();

                    MySqlCommand cmd = new MySqlCommand(query, conn);

                    // Execute query
                    cmd.ExecuteNonQuery();
                }
            }
            catch (Exception exception)
            {
                System.Diagnostics.Debug.WriteLine(exception);
            }
        }
    }
}
