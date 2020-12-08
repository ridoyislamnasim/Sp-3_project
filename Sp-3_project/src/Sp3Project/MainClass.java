package Sp3Project;

//import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//import java.awt.HeadlessException;
//import java.sql.DriverManager;
//import javax.swing.JOptionPane;
//Home Page
public class MainClass{
   public  Connection connect = null;
    public  Statement statement = null;
    public  PreparedStatement preparedStatement = null;
    public ResultSet result = null;
    Scanner sc = null;
    Scanner scn = null;
   public void MainClas(){
    
      
//    void read(){
//
//    }
//        ArrayList<ProductName> ProductList=new ArrayList<>();
        Shop Order=new Shop();
        int select;
        
        Scanner scr=new Scanner(System.in);
        do{
            Menumain();
            select=scr.nextInt();
            switch (select){
                
                case 2:
                                        int select1;
                                          do{
                                             CastomarSinginFrom();
                                             MenuRestuarant();
                                             select1=scr.nextInt();
                                             switch(select1){
                                                 case 1:
                                                     break;
                                         
                                                  case 2:
                                                        break;
                                                   case 3:
                                                        break;     
                                                    case 4:    
                                                        break;  
                                                     case 0:
                                                        System.out.println("Back");
                                                        break;   
                        
                                                    default:
                                                        break;
                                                       }
                                                    }while (select1 !=0);
                                                     break;
                    
                    
                case 1:
                    
                   
                                                  int select2; 
                                               do{
                                              CastomarLoginFrom();
                                              Customerorder();
                                                 select2=scr.nextInt();
                                                 switch(select2){
                                                     case 1:
                                                         Order.Cloths();
                                                          int select3;
                                                          do{

                                                             select3=scr.nextInt();
                                                             switch(select3){
                                                                 case 1:
                                                                     break;

                                                                  case 2:                                                                  
                                                                   case 3:                                                                 
                                                                        break;     
                                                                    case 4:                                                                             
                                                                        break;    
                                                                     case 0:
                                                                        System.out.println("Back");
                                                                        break;   

                                                                    default:
                                                                        break;
                                                                       }
                                                                    }while (select3 !=0);
                                                                     break;
                                                     case 2:
                                                         
                                                         break;
                                                     case 3:
                                                         
                                                         break;
                                                 case 0:
                                                    System.out.println("Back");
                                                    LogOut logout=new LogOut();
                                                    logout.MainClass();
                                                    break;  
                                                     
                                                    
                                                default:
                                                    break;
                                            }
                                        }while (select2 !=5);
                                       break;
                                                default:
                                                    break;
                                            }
    }while(select !=3);
    
            }
          
     public static void MenuRestuarant(){
        System.out.println("---Menu Restuarant---");
        
        System.out.println("1. Add food");
        System.out.println("2. Edit food");
        System.out.println("3. Delete food");
        System.out.println("4. Print Customer Serial Number");
        //System.out.println("5. Payment");
        System.out.println("6.Show all food");
        System.out.println("0.Back to menu main");
        System.out.println("--------");
        
                  
     }
    
    static void Menumain(){
        System.out.println("Wellcome My Shop");
        System.out.println("1.Log in");
        System.out.println("2.Sing in");

    }
   void CastomarSinginFrom(){
       System.out.println("---Please fill up the from---");
            
//
//                    String username = CastomarSingin.nextLine();
//                    System.out.println("Inter gamil:");
//                    String gamil = CastomarSingin.nextLine();
//                    System.out.println("Inter gander:");
//                    String gander = CastomarSingin.nextLine();
//                    System.out.println("Inter age:");
//                    String age = CastomarSingin.nextLine();
//                    System.out.println("Inter Password:");
//                    String password = CastomarSingin.nextLine();
                     try {
                        sc = new Scanner(System.in);
                        connect = ApiClient.getInstance();
                    //statement = connect.createStatement();
                    // result = statement.executeQuery("SELECT * FROM blood_donation.donor");

                      preparedStatement = connect.prepareStatement(" INSERT INTO singin(user_name,password,gender,age) VALUES(?,?,?,?);");
                         System.out.println("Inter your name:");
                      preparedStatement.setString(1, sc.nextLine());
                         System.out.println("Inter password:");
                      preparedStatement.setString(2, sc.nextLine());          
                         System.out.println("Inter your gender:");
                      preparedStatement.setString(3, sc.nextLine());
                         System.out.println("Inter your age:");
                      preparedStatement.setString(4, sc.nextLine());
//                         System.out.println("Inter blood_group:");
//                       preparedStatement.setString(4, sc.nextLine());
//                         System.out.println("Inter gander:");
//                       preparedStatement.setString(5, sc.nextLine());
//                         System.out.println("Inter Weight:");
//                       preparedStatement.setString(6, sc.nextLine());
                       preparedStatement.execute();

//                        if (result.next()) {
//                           
//                             System.out.println("id: " + result.getString("user_id"));
//                              System.out.println("password: " + result.getString("username"));
//                               System.out.println("id: " + result.getString("password"));
//                           System.out.println("Wellcome Our Shop");
////                           LogOut logout=new LogOut();
////                           logout.MainClass();
//                        }else{
//                          System.out.println("Please Inter Your Correct Information !!!");
//                          CastomarSinginFrom();
//                          
//                        }

        } catch (ClassNotFoundException | SQLException e) {
           System.out.println(e);
        } 
    
//                    LogOut logout=new LogOut();
//                    logout.MainClass();
   }
 void CastomarLoginFrom(){
    
                        try {
                        scn = new Scanner(System.in);
                        connect = ApiClient.getInstance();
                    //statement = connect.createStatement();
                    // result = statement.executeQuery("SELECT * FROM blood_donation.donor");

                      preparedStatement = connect.prepareStatement("SELECT*FROM login WHERE user_name=? AND password=?;");
                        System.out.println("Inter your user name:");
                       preparedStatement.setString(1, scn.nextLine());
                         System.out.println("Inter Password:");
                       preparedStatement.setString(2, scn.nextLine());
                       
                        result = preparedStatement.executeQuery();

                        if (result.next()) {
                            System.out.println("name: " + result.getString("user_name"));
                            System.out.println("age: " + result.getString("password"));
                           System.out.println("Wellcome Our Shop");
                        }else{
                          System.out.println("Worng password !!!");
                          System.out.println("Please Inter Correct Username AND Password !!!");
                          CastomarLoginFrom();
                          
                        }

        } catch (ClassNotFoundException | SQLException e) {

        } 
    
                  

    }
                   
    static void Customerorder() {
        System.out.println("---Customer Service");
        System.out.println("1.Show all food // Cloths");
        System.out.println("2.Order now// Shoes");
        System.out.println("3.Show Oder Status//Cosmetic");
          System.out.println("0.Log Out !!!");
        
           
    }
    
    
    public static void main(String[]args){
      
            MainClass main = new MainClass();
                main.MainClas();
}
}
    
