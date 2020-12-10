package Sp3Project;


import java.util.Scanner;
//Association
public class Shop {
//    ArrayList<ProductName> foodlist=new ArrayList<>();
   // ArrayList<CustomerOrder> Order=new ArrayList<>();
//    ArrayList<FoodStatus> foodcustomer=new ArrayList<>();
//    ProductName  Food;                             
//    public CustomerOrder CustomerOrder;
//    public int SelectFood;
//    private String deletefood;
//  public void Shop(){
//  }  
//    
  void Cloths(){
     
                         
  Scanner cloths=new Scanner(System.in);
                    int select4;
                    
                    do{
                        
                    System.out.println("T-Shart (Price=$100)");
                    System.out.println("pant (Price=$150)");
                    System.out.println("Shari (Price=$100)");
                    System.out.println("Chap (Price=$10)");
                    System.out.println("1.Add product:");
                    System.out.println("2.Selected product Show:");
                    System.out.println("3.Delect product:");
                    System.out.println("0.Back");
                     select4 = cloths.nextInt();
                    switch(select4){
                        case 1:
                         ProductList ridoy = new ProductList();
                         ridoy.AddProductCloth();
                            break;
                         case 2:
                               System.out.println("Run");
                             SelectedProduct ridoy2 = new SelectedProduct();
                             ridoy2.SelectedProductShow(); 
                          System.out.println("Run");
                            break;
                          case 3:
//                            DelectProductCloth();
                          
                            break;
                        case 0:
                            
                            break;
                     
                    }
                    }while(select4 !=0);                 
 }
  void Shoes(){
      Scanner shoes=new Scanner(System.in);
        int select4;
                    
                    do{      
                    System.out.println("Loafers Shoes (Price=$300)");
                    System.out.println("Sports Shoes (Price=$250)");
                    System.out.println("Formal Shoes (Price=$200)");
                    System.out.println("Sandals (Price=$110)");
                    System.out.println("1.Add product:");
                    System.out.println("2.Selected product Show:");
                    System.out.println("3.Delect product:");
                    System.out.println("0.Back");
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
//                            DelectProductCloth();
                          
                            break;
                        case 0:
                            
                            break;
                     
                    }
                    }while(select4 !=0); 

}
  void Cosmetic(){
   Scanner shoes=new Scanner(System.in);
        int select4;
                    
                    do{      
                    System.out.println("Makeup box (Price=$300)");
                    System.out.println("Beauty Face Wash (Price=$250)");
                    System.out.println("Beauty Cream (Price=$200)");
                    System.out.println("Lip stick (Price=$110)");
                    System.out.println("1.Add product:");
                    System.out.println("2.Selected product Show:");
                    System.out.println("3.Delect product:");
                    System.out.println("0.Back");
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
//                            DelectProductCloth();
                          
                            break;
                        case 0:
                            
                            break;
                     
                    }
                    }while(select4 !=0); 

  
  
  }
}
