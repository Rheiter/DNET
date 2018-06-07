using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data;
using MySql.Data.MySqlClient;

namespace Data
{
    public class DBConnection
    {
        private DBConnection() { }
        
        public MySqlConnection Connection
        {
            get
            {
                string connstring = "Server=localhost; ; database=dnet_webshop; UID=dnet; password=Webshop; sslMode=none";
                return new MySqlConnection(connstring);

            }
        }

        private static DBConnection _instance = null;
        public static DBConnection Instance()
        {
            if (_instance == null)
                _instance = new DBConnection();
            return _instance;
        }
    }
}
