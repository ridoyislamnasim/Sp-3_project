
package Sp3Project;

import java.sql.SQLException;
import java.util.Scanner;


public class ProductList  extends MainClass {
  
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
                    System.out.println("\n1.Makeup box (Price=$300)");
                    System.out.println("2.Beauty Face Wash (Price=$250)");
                    System.out.println("3.Beauty Cream (Price=$200)");
                    System.out.println("4.Lip stick (Price=$110)");
                    System.out.println("Please Input Select Product Id:");
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
                             Shop ad =new Shop();
                             ad.Cosmetic();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);}
                              
                            break;
                         case 2: 
                              try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('Beauty Face Wash',250);");
                             preparedStatement.execute();
                             Shop ad =new Shop();
                             ad.Cosmetic();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
                            break;
                          case 3:
                               try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('Beauty Cream ',200);");
                             preparedStatement.execute();
                              Shop ad =new Shop();
                             ad.Cosmetic();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
                            break;
                           case 4:
                               try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('Lip stick',110);");
                             preparedStatement.execute();
                              Shop ad =new Shop();
                             ad.Cosmetic();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
                            break;
                        case 0:
                            
                            break;
                     
                    }
                    }while(select5 !=0);


    
}
void showdisplayshoes(){
                System.out.println("\n1.Loafers Shoes (Price=$300)");
                    System.out.println("2.Sports Shoes (Price=$250)");
                    System.out.println("3.Formal Shoes (Price=$200)");
                    System.out.println("4.Sandals (Price=$110)");
                    System.out.println("Please Input Select Product Id:");
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
                             Shop a =new Shop();
                             a.Shoes();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
                              
                            break;
                         case 2: 
                              try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('Sports Shoes ',250);");
                             preparedStatement.execute();
                             Shop a =new Shop();
                             a.Shoes();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
                             
                            break;
                          case 3:
                               try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('Formal Shoes',200);");
                             preparedStatement.execute();
                             Shop a =new Shop();
                             a.Shoes();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
                            break;
                           case 4:
                               try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('Sandals',110);");
                             preparedStatement.execute();
                             Shop a =new Shop();
                             a.Shoes();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
                            break;
                        case 0:
                            
                            break;
                     
                    }
                    }while(select5 !=0);
  }
      void showdisplaycloth(){  System.out.println("\n1.T-Shart (Price=$100)");
                    System.out.println("2.pant (Price=$150)");
                    System.out.println("3.Shari (Price=$500)");
                    System.out.println("4.Chap (Price=$10)");
                    System.out.println("Please Input Select Product Id:");
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
                             Shop add =new Shop();
                             add.Cloths();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 

                              
                            break;
                         case 2: 
                              try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('pant',150);");
                             preparedStatement.execute();
                             Shop add =new Shop();
                             add.Cloths();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
                             
                            break;
                          case 3:
                               try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('Shari',500);");
                             preparedStatement.execute();
                             Shop add =new Shop();
                             add.Cloths();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 
                             
                            break;
                           case 4:
                               try {
                             scn = new Scanner(System.in);
                             connect = ApiClient.getInstance();
                             preparedStatement = connect.prepareStatement(" INSERT INTO addproduct(name,rate) VALUES('Chap',50);");
                             preparedStatement.execute();
                             Shop add =new Shop();
                             add.Cloths();
                           } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);} 

                            break;
                        case 0:
                            
                            break;
                     
                    }
                    }while(select5 !=0);

      }
     
 }
