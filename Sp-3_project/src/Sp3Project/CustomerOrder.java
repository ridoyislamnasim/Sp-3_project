//package Sp3Project;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.Scanner;
//public class CustomerOrder{
//    
//       public  Connection connect = null;
//    public  Statement statement = null;
//    public  PreparedStatement preparedStatement = null;
//    public ResultSet result = null;
//    Scanner scn=null;
//       
//   void show(){
//          int sel;
//             do{
//                     System.out.println("dfghjkl;");
//                     sel=scn.nextInt();
//                     
//                     switch(sel){
//                         case 1:
//                            Shop Order=new Shop();
//                             Order.Cloths();
//                              int select3;
//                              do{
//
//                                 select3=scn.nextInt();
//                                 switch(select3){
//                                     case 1:
//                                         break;
//
//                                      case 2:                                                                  
//                                       case 3:                                                                 
//                                            break;     
//                                        case 4:                                                                             
//                                            break;    
//                                         case 0:
//                                            System.out.println("Back");
//                                            break;   
//
//                                        default:
//                                            break;
//                                           }
//                                        }while (select3 !=0);
//                                         break;
//                         case 2:
//
//                             break;
//                         case 3:
//
//                             break;
//                     case 0:
//                        System.out.println("Back");
//                        LogOut logout=new LogOut();
//                        logout.MainClass();
//                        break;  
//
//
//                    default:
//                        break;
//                     }
//             }while(sel!=7);
// 
//}
//
//}