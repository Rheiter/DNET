using Data;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WebshopService
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "WebshopService" in both code and config file together.
    public class WebshopService : IWebshopService
    {
        public List<Product> GetProducts()
        {
            ProductDAO productDAO = new ProductDAO();
            return productDAO.GetAllProducts();
        }

        public bool InsertCustomer(string username, string password)
        {
            CustomerDAO customerDAO = new CustomerDAO();
            return customerDAO.Insert(username, password);
        }

        public Customer GetCustomer(string username, string password)
        {
            CustomerDAO customerDAO = new CustomerDAO();
            return customerDAO.GetCustomer(username, password);
        }

        public string Buy(Product product, Customer customer)
        {
            if (GetQnty(product) <= 0)
                return "This product is sold out!";
            
            if (product.Price > GetCredit(customer))
                return "Not enough money to buy this product!";

            ProductDAO productDAO = new ProductDAO();
            return productDAO.Buy(product, customer);
        }

        public int GetQnty(Product product)
        {
            ProductDAO productDAO = new ProductDAO();
            return productDAO.GetQnty(product);
        }

        public List<Product> GetCart(Customer customer)
        {
            ProductDAO productDAO = new ProductDAO();
            return productDAO.GetCart(customer);
        }

        public decimal GetCredit(Customer customer)
        {
            CustomerDAO customerDAO = new CustomerDAO();
            return customerDAO.GetCredit(customer.Username);
        }
    }
}
