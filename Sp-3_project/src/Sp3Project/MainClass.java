package Sp3Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class MainClass{
    
   public  Connection connect = null;
    public  Statement statement = null;
    public  PreparedStatement preparedStatement = null;
    public ResultSet result = null;
    Scanner sc = null;
    Scanner scn = null;
   public void MainClass(){
    

        int select;
        
        Scanner scr=new Scanner(System.in);
         do{
            Menumain();
            select=scr.nextInt();
            switch (select){
               case 1:                   
                    CastomarLoginFrom();    
                     show(); 
                    break;   
                case 2:
                     CastomarSinginFrom();
                      break;                  
                default:
                 break;
                }
            }while (select !=0);
                                              
 }  
   
   
  public  void show(){
    
      Order();
          int sel;
          Scanner ss=new Scanner(System.in);
          
             do{
                     
                     sel=ss.nextInt();
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
                        LogOut logout=new LogOut();
                        logout.MainClasslogout();
                         break;
                    default:
                        break;
                     }
             }while(sel!=0);

}
  
 
   
    

   void CastomarSinginFrom(){
       System.out.println("---Please fill up the from---");
          
                     try {
                        sc = new Scanner(System.in);
                        connect = ApiClient.getInstance();
                  
                      preparedStatement = connect.prepareStatement("INSERT INTO singin(username,gmail,password,gender,age) VALUES(?,?,?,?,?);");
                         System.out.println("Inter your name:");
                      preparedStatement.setString(1, sc.nextLine());
                         System.out.println("Inter Gmail:");
                      preparedStatement.setString(2, sc.nextLine());          
                         System.out.println("Inter your password:");
                      preparedStatement.setString(3, sc.nextLine());
                         System.out.println("Inter your gander:");
                      preparedStatement.setString(4, sc.nextLine());
                          System.out.println("Inter your age:");
                      preparedStatement.setString(5, sc.nextLine());  
                       preparedStatement.execute();
                        

        } catch (ClassNotFoundException | SQLException e) {
           System.out.println(e);
        } 
   }
 void CastomarLoginFrom(){
    
                        try {
                        scn = new Scanner(System.in);
                        connect = ApiClient.getInstance();
                   
                      preparedStatement = connect.prepareStatement("SELECT*FROM singin WHERE username=? AND password=?;");
                        System.out.println("Inter your user name:");
                       preparedStatement.setString(1, scn.nextLine());
                         System.out.println("Inter Password:");
                       preparedStatement.setString(2, scn.nextLine());
                       
                        result = preparedStatement.executeQuery();
                    
                        if(result.next()) {
                            System.out.println("Wellcome Our Shop\n");                        
                        }else{
                         System.out.println("Wrong password!!!\n");
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
 static void Menumain(){
        System.out.println("\n Wellcome My Shop");
        System.out.println("1.Log in");
        System.out.println("2.Sing in");

    } 
    

}
    
