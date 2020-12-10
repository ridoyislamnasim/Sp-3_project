
package Sp3Project;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//import java.sql.Statement;
//import java.util.Scanner;



public class ProductList extends MainClass  {
   
//    public  Connection connect = null;
//    public  Statement statement = null;
//    public  PreparedStatement preparedStatement = null;
//    public ResultSet result = null;
//    Scanner scn = null;
  public void AddProductCloth(){

                    showdisplaycloth();
                    addcloth();
               } 
public void AddProductShoes(){
        showdisplayshoes();
        addshoes();
      }
public void AddProductCosmetic(){
        showdisplayCosmetic();
        addsCosmetic();
      
}
void showdisplayCosmetic(){
            System.out.println("1.Makeup box (Price=$300)");
                    System.out.println("2.Beauty Face Wash (Price=$250)");
                    System.out.println("3.Beauty Cream (Price=$200)");
                    System.out.println("4.Lip stick (Price=$110)");
}
void addsCosmetic(){
         int select5;
                    Scanner addcloths=new Scanner(System.in);
                    do{
                     select5 = addcloths.nextInt();
                    switch(select5){
                        case 1: 
                            try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('Makeup box',300);");
                             preparedStatement.execute();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
//                            MainClass ridoy2 = new MainClass();
                            show();
                              
                            break;
                         case 2: 
                              try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('Beauty Face Wash',250);");
                             preparedStatement.execute();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
                              show();
                            break;
                          case 3:
                               try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('Beauty Cream ',200);");
                             preparedStatement.execute();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
                               show();
                            break;
                           case 4:
                               try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('Lip stick',110);");
                             preparedStatement.execute();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
                               show();
                            break;
                        case 0:
                            
                            break;
                     
                    }
                    }while(select5 !=0);


    
}
void showdisplayshoes(){
                System.out.println("1.Loafers Shoes (Price=$300)");
                    System.out.println("2.Sports Shoes (Price=$250)");
                    System.out.println("3.Formal Shoes (Price=$200)");
                    System.out.println("4.Sandals (Price=$110)");
}
  void addshoes(){
        int select5;
                    Scanner addcloths=new Scanner(System.in);
                    do{
                     select5 = addcloths.nextInt();
                    switch(select5){
                        case 1: 
                            try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('Loafers Shoes',300);");
                             preparedStatement.execute();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
//                            MainClass ridoy2 = new MainClass();
                            show();
                              
                            break;
                         case 2: 
                              try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('Sports Shoes ',250);");
                             preparedStatement.execute();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
                              show();
                            break;
                          case 3:
                               try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('Formal Shoes',200);");
                             preparedStatement.execute();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
                               show();
                            break;
                           case 4:
                               try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('Sandals',110);");
                             preparedStatement.execute();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
                               show();
                            break;
                        case 0:
                            
                            break;
                     
                    }
                    }while(select5 !=0);
  }
      void showdisplaycloth(){  System.out.println("1.T-Shart (Price=$100)");
                    System.out.println("2.pant (Price=$150)");
                    System.out.println("3.Shari (Price=$500)");
                    System.out.println("4.Chap (Price=$10)");
      }
      
      void addcloth(){
          int select5;
                    Scanner addcloths=new Scanner(System.in);
                    do{
                     select5 = addcloths.nextInt();
                    switch(select5){
                        case 1: 
                            try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('T-Shart',100);");
                             preparedStatement.execute();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
                            
//                            MainClass ridoy2 = new MainClass();
                            show();
                              
                            break;
                         case 2: 
                              try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('pant',150);");
                             preparedStatement.execute();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
                              show();
                            break;
                          case 3:
                               try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('Shari',500);");
                             preparedStatement.execute();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
                               show();
                            break;
                           case 4:
                               try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('Chap',50);");
                             preparedStatement.execute();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
                               show();
                            break;
                        case 0:
                            
                            break;
                     
                    }
                    }while(select5 !=0);

      }//end AddProductCloth
     
 }
                       
//      }
//          
//                     }while(select5 !=6);
//                    
//                    }

//     void DelectProductCloth(){
//         System.out.println("delect");
//     }                         
//                 
