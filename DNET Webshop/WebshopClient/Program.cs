using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;
using WebshopClient.ServiceReference;

namespace WebshopClient
{
    static class Program
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new LoginForm());
        }
    }

    public class GlobalClient
    {
        private readonly WebshopServiceClient client = new WebshopServiceClient();
        private static GlobalClient _instance;

        private GlobalClient()
        {
            
        }

        public static GlobalClient Instance()
        {
            if (_instance == null)
                _instance = new GlobalClient();
            return _instance;
        }

        public WebshopServiceClient Client { get { return client; } }
    }
}
