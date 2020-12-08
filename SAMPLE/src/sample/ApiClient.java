package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
abstract class ApiClient {
    private static Connection connector =null;
    
    static Connection getInstance() throws SQLException, ClassNotFoundException
    {
        if(connector==null)
        {
            
            connector = DriverManager.getConnection("jdbc:mysql://localhost/blood_donation?"+"user=root");
        }
       return connector;
    }

}
