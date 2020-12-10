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
//        Shop Ordr=new Shop();
//        Ordr.Cloths();
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
//                                             MenuRestuarant();
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
                    
                    CastomarLoginFrom();
                    
                    // CustomerOrder ri=new CustomerOrder();
                     show();
               case 0:
                        System.out.println("Back");
                        LogOut logout=new LogOut();
                        logout.MainClass();
                        break;  
                default:
                 break;
                }
            }while (select !=0);
                                      
                                                
 }  
 void show(){
      Order();
          int sel;
             do{
                     System.out.println("dfghjkl;");
                     sel=scn.nextInt();
                     
                     switch(sel){
                         case 1:
                            Shop Order=new Shop();
                             Order.Cloths();
                              
                         case 2:
                            Shop Order2=new Shop();
                            Order2.Shoes();
                             break;
                         case 3:
                              Shop Order3=new Shop();
                            Order3.Cosmetic();
                             break;
                     case 0:
                        System.out.println("Back");
                        LogOut logout=new LogOut();
                        logout.MainClass();
                        break;  


                    default:
                        break;
                     }
             }while(sel!=0);
 
}
  
   

//     public static void MenuRestuarant(){
//        System.out.println("---Menu Restuarant---");
//        
//        System.out.println("1. Add food");
//        System.out.println("2. Edit food");
//        System.out.println("3. Delete food");
//        System.out.println("4. Print Customer Serial Number");
//        //System.out.println("5. Payment");
//        System.out.println("6.Show all food");
//        System.out.println("0.Back to menu main");
//        System.out.println("--------");
//        
//                  
//     }
   
    
    static void Menumain(){
        System.out.println("Wellcome My Shop");
        System.out.println("1.Log in");
        System.out.println("2.Sing in");

    }
   void CastomarSinginFrom(){
       System.out.println("---Please fill up the from---");
          
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
//                        
                       preparedStatement.execute();

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

                      preparedStatement = connect.prepareStatement("SELECT*FROM singin WHERE user_name=? AND password=?;");
                        System.out.println("Inter your user name:");
                       preparedStatement.setString(1, scn.nextLine());
                         System.out.println("Inter Password:");
                       preparedStatement.setString(2, scn.nextLine());
                       
                        result = preparedStatement.executeQuery();

                        while(result.next()) {
                            System.out.println("name: " + result.getString("user_name"));
                            System.out.println("age: " + result.getString("password"));
                            System.out.println("Wellcome Our Shop");
                            

                          
                        }

        } catch (ClassNotFoundException | SQLException e) {

        } 
    
                  

    }
                   
    static void Order() {
        System.out.println("---Customer Service");
        System.out.println("1.Show all  Cloths");
        System.out.println("2.Show all Shoes");
        System.out.println("3.Show all Cosmetic");
        System.out.println("0.Log Out !!!");
        
           
    }
    
    

}
    
