package Sp3Project;

//import java.util.ArrayList;
import java.util.Scanner;
//Home Page
public class MainClass{
    
    
    public static void main(String[]args){
     
    
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
                                                         MenuRestuarant();
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
   static void CastomarSinginFrom(){
       System.out.println("---Please fill up the from---");
       Scanner CastomarSingin =new Scanner(System.in);
                    System.out.println("Inter your user name:");
                    String username = CastomarSingin.nextLine();
                    System.out.println("Inter gamil:");
                    String gamil = CastomarSingin.nextLine();
                    System.out.println("Inter gander:");
                    String gander = CastomarSingin.nextLine();
                    System.out.println("Inter age:");
                    String age = CastomarSingin.nextLine();
                    System.out.println("Inter Password:");
                    String password = CastomarSingin.nextLine();
   }
static void CastomarLoginFrom(){
                    Scanner CastomarLogin =new Scanner(System.in);
                    System.out.println("Inter your user name:");
                    String username = CastomarLogin.nextLine();
                    System.out.println("Inter Password:");
                    String password = CastomarLogin.nextLine();
}
    static void Customerorder() {
        System.out.println("---Customer Service");
        System.out.println("1.Show all food // Cloths");
        System.out.println("2.Order now// Shoes");
        System.out.println("3.Show Oder Status//Cosmetic");
          System.out.println("0.Log Out !!!");
        
           
    }
}
    
