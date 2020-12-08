package sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MySQLDatabase {
    
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet result = null;
    Scanner sc = null;

    void readData() {
        try {
               sc = new Scanner(System.in);
            connect = ApiClient.getInstance();
         
//            statement = connect.createStatement();
//             result = statement.executeQuery("SELECT * FROM blood_donation.donor");

            preparedStatement = connect.prepareStatement("SELECT*FROM donor WHERE username=?;");

           preparedStatement.setString(1, sc.nextLine());
            result = preparedStatement.executeQuery();

            while (result.next()) {
                System.out.println("name: " + result.getString("username"));
//                System.out.println("age: " + result.getString("password"));
//                System.out.println("gender: " + result.getString("gender"));
            }

        } catch (ClassNotFoundException | SQLException e) {

        } 
//            finally {
//          // ApiClient.close();
//        }

    }

}
