
package Sp3Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Scanner;

public class DelectProduct {
  
            private Connection connect = null;
   // private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet result = null;
    Scanner sc = null;
    
   void DelectProduct(){
      try {
            sc = new Scanner(System.in);
            connect = ApiClient.getInstance();
            //Product Show            
            preparedStatement = connect.prepareStatement("SELECT id,name,rate FROM addproduct;");
            result = preparedStatement.executeQuery();
            System.out.println("Index"+"--"+ "ProductName:"+"--"+" Rate: ");
            while (result.next()) {
                 
                System.out.println(result.getString("id")+'.'+"----"+ result.getString("name")+"----" + result.getString("rate"));             
            }

            //Product delete
             preparedStatement = connect.prepareStatement("DELETE FROM addproduct WHERE id=?;");
             System.out.println("Inter delect product Index Id:");
              preparedStatement.setString(1, sc.nextLine());
              preparedStatement.execute();


        } catch (ClassNotFoundException | SQLException e) {

        }
}
}