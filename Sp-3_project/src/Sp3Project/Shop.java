package Sp3Project;


import java.util.Scanner;
//Association
public class Shop{
//    ArrayList<ProductName> foodlist=new ArrayList<>();
   // ArrayList<CustomerOrder> Order=new ArrayList<>();
//    ArrayList<FoodStatus> foodcustomer=new ArrayList<>();
//    ProductName  Food;                             
//    public CustomerOrder CustomerOrder;
//    public int SelectFood;
//    private String deletefood;
  public void Shop(){
  }  
    
 public void Cloths(){
  Scanner cloths=new Scanner(System.in);
                    int select4;
                    
                    do{
                        
                    System.out.println("T-Shart (Price=$100)\n");
                    System.out.println("pant (Price=$150)\n");
                    System.out.println("Shari (Price=$100)\n");
                    System.out.println("Chap (Price=$10)\n");
                    System.out.println("1.Add product:");
                    System.out.println("2.Reselect product:");
                    System.out.println("3.Delect product:");
                    System.out.println("0.Back");
                     select4 = cloths.nextInt();
                    switch(select4){
                        case 1:
                        
                          
                            break;
                        case 0:
                            
                            break;
                     
                    }
                    }while(select4 !=3);
                    
 }
}