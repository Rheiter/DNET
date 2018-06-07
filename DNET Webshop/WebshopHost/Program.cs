using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace WebshopHost
{
    class Program
    {
        static void Main(string[] args)
        {
            var svc = new WebshopService.WebshopService();
            using (ServiceHost host = new ServiceHost(svc))
            {
                Console.WriteLine("Service is running...");
                Console.ReadKey();
            }

            Console.WriteLine("Service has quit...");
        }
    }
}
