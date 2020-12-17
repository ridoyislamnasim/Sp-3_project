
package Sp3Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectedProduct{
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet result = null;
    Scanner sc = null;
     void SelectedProductShow(){
     try {
              
            connect = ApiClient.getInstance();
            preparedStatement = connect.prepareStatement("SELECT id,name,rate FROM addproduct;");
            result = preparedStatement.executeQuery();
            System.out.println("Index" + "Product name:" +" Rate: ");
            while (result.next()) {
                 
                System.out.println(result.getString("id")+'.'+"---"+ result.getString("name")+"----" + result.getString("rate"));             
            }

        

        } catch (ClassNotFoundException | SQLException e) {

        }

       
     }    
    
    
}
