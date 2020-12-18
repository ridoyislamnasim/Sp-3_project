package Sp3Project;


import java.util.Scanner;
//Association
public class Shop extends MainClass {   
  void Cloths(){
  Scanner cloths=new Scanner(System.in);
                    int select4;
                    
                    do{
                        
                    System.out.println("\nT-Shart (Price=$100)");
                    System.out.println("pant (Price=$150)");
                    System.out.println("Shari (Price=$100)");
                    System.out.println("Chap (Price=$10)");
                    System.out.println("1.Add product:");
                    System.out.println("2.Selected product Show:");
                    System.out.println("3.Delect product:");
                    System.out.println("4.Back:");
                    System.out.println("0.LogOut");
                    System.out.println("Please Input Select Item Id:");

                     select4 = cloths.nextInt();
                    switch(select4){
                        case 1:
                         ProductList ridoy = new ProductList();
                         ridoy.AddProductCloth();
                            break;
                         case 2:
                             SelectedProduct ridoy2 = new SelectedProduct();
                             ridoy2.SelectedProductShow(); 
                       
                            break;
                          case 3:
                             DelectProduct ridoy3 =new DelectProduct();
                             ridoy3.DelectProduct();
                            break;
                          case 4:
                             show();
                              break;
                         case 0:
                            LogOut logout=new LogOut();
                            logout.MainClasslogout();
                            break;
                     
                    }
                    }while(select4 !=0);                 
 }
  void Shoes(){
      Scanner shoes=new Scanner(System.in);
        int select4;
                    
                    do{      
                    System.out.println("\nLoafers Shoes (Price=$300)");
                    System.out.println("Sports Shoes (Price=$250)");
                    System.out.println("Formal Shoes (Price=$200)");
                    System.out.println("Sandals (Price=$110)");
                    System.out.println("1.Add product:");
                    System.out.println("2.Selected product Show:");
                    System.out.println("3.Delect product:");
                    System.out.println("4.Back:");
                    System.out.println("0.LogOut");
                    System.out.println("Please Input Select Item Id:");

                     select4 = shoes.nextInt();
                    switch(select4){
                        case 1:
                         ProductList ridoy = new ProductList();
                         ridoy.AddProductShoes();
                            break;
                         case 2:
                             SelectedProduct ridoy2 = new SelectedProduct();
                             ridoy2.SelectedProductShow();
                            break;
                          case 3:
                             DelectProduct ridoy3 =new DelectProduct();
                              ridoy3.DelectProduct();
                          
                            break;
                          case 4:
                             show();
                              break;
                        case 0:
                            LogOut logout=new LogOut();
                            logout.MainClasslogout();
                            break;
                     
                    }
                    }while(select4 !=0); 

}
  void Cosmetic(){
   Scanner shoes=new Scanner(System.in);
        int select4;
                    
                    do{      
                    System.out.println("\nMakeup box (Price=$300)");
                    System.out.println("Beauty Face Wash (Price=$250)");
                    System.out.println("Beauty Cream (Price=$200)");
                    System.out.println("Lip stick (Price=$110)");
                    System.out.println("1.Add product:");
                    System.out.println("2.Selected product Show:");
                    System.out.println("3.Delect product:");
                    System.out.println("4.Back:");
                    System.out.println("0.LogOut");
                    System.out.println("Please Input Select Item Id:");

                     select4 = shoes.nextInt();
                    switch(select4){
                        case 1:
                         ProductList ridoy = new ProductList();
                         ridoy.AddProductCosmetic();
                            break;
                         case 2:
                             SelectedProduct ridoy2 = new SelectedProduct();
                             ridoy2.SelectedProductShow();
                            break;
                          case 3:
                              DelectProduct ridoy3 =new DelectProduct();
                              ridoy3.DelectProduct();
                          
                            break;
                         case 4:
                             show();
                              break; 
                        case 0:
                            LogOut logout=new LogOut();
                            logout.MainClasslogout();
                            break;
                     
                    }
                    }while(select4 !=0); 

  
  
  }
}
