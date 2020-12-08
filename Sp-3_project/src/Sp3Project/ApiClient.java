package Sp3Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 abstract class ApiClient {
    private static Connection connector;
    
    static Connection getInstance() throws SQLException, ClassNotFoundException
    {
        if(connector==null)
        {
            Class.forName("com.mysql.jdbc.Driver");
            connector = DriverManager.getConnection("jdbc:mysql://localhost/project_sp3_myshop?"+"user=root");
        }
       return connector;
    }

}
