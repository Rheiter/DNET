using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WebshopService
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "IWebshopService" in both code and config file together.
    [ServiceContract]
    public interface IWebshopService
    {
        [OperationContract]
        List<Product> GetProducts();

        [OperationContract]
        bool InsertCustomer(string username, string password);

        [OperationContract]
        Customer GetCustomer(string username, string password);

        [OperationContract]
        string Buy(Product product, Customer customer);

        [OperationContract]
        int GetQnty(Product product);

        [OperationContract]
        List<Product> GetCart(Customer customer);

        [OperationContract]
        decimal GetCredit(Customer customer);
    }

    // Use a data contract as illustrated in the sample below to add composite types to service operations.
    // You can add XSD files into the project. After building the project, you can directly use the data types defined there, with the namespace "WebshopService.ContractType".
    [DataContract]
    public class Product
    {
        [DataMember]
        public string Name { get; set; }

        [DataMember]
        public decimal Price { get; set; }

        [DataMember]
        public int Qnty { get; set; }
    }

    [DataContract]
    public class Customer
    {
        [DataMember]
        public string Username { get; set; }

        [DataMember]
        public string Password { get; set; }

        [DataMember]
        public decimal Credit { get; set; }
    }
}
