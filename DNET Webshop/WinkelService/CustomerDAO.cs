using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using WebshopService;

namespace Data
{
    class CustomerDAO
    {
        public bool Insert(string username, string password)
        {
            string query = $"INSERT INTO customer (username, password) VALUES ('{username}', '{password}')";

            try
            {
                // Open connection
                using (MySqlConnection conn = DBConnection.Instance().Connection)
                {
                    // Open connection
                    conn.Open();

                    // Create command
                    MySqlCommand cmd = new MySqlCommand(query, conn);

                    // Execute command
                    cmd.ExecuteNonQuery();

                    return true;
                }
            }
            catch (Exception)
            {
                return false;
            }
        }

        public Customer GetCustomer(string username, string password)
        {
            Customer customer = null;

            string query = $"SELECT * FROM customer WHERE username = '{username}' AND password = '{password}'";

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

                    // Read the data
                    while (dataReader.Read())
                    {
                        customer = new Customer();

                        customer.Username = dataReader.GetString("username");
                        customer.Password = dataReader.GetString("password");
                        customer.Credit = dataReader.GetInt32("credit");
                    }

                    // Close Data Reader
                    dataReader.Close();

                    // Return customer;
                    return customer;
                }
            }
            catch (Exception)
            {
                // Return null
                return customer;
            }
        }

        public decimal GetCredit(string username)
        {
            decimal credit = 0m;

            string query = $"SELECT credit FROM customer WHERE username = '{username}'";

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

                    // Read the data
                    while (dataReader.Read())
                    {
                        credit = dataReader.GetDecimal("credit");
                    }

                    // Close Data Reader
                    dataReader.Close();

                    // Return customer;
                    return credit;
                }
            }
            catch (Exception)
            {
                // Return null
                return credit;
            }
        }
    }
}
