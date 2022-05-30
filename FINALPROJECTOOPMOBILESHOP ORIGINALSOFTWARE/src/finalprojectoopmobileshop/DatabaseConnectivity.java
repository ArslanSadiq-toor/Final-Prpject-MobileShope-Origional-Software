

package finalprojectoopmobileshop;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnectivity 
{
    Connection connection;
    public Connection getDatabaseConnectivity()
    {
          try
        {
            DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
            connection = DriverManager.getConnection("jdbc:odbc:talha");
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
          return connection;
    }
    
}
