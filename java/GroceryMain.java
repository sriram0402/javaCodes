import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
// import GroceryItem.*;
public class GroceryMain {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        ArrayList<GroceryItem> itemDetails = new ArrayList<GroceryItem>();
        while(true){
            GroceryItem addToCart=addToCart();
            itemDetails.add(addToCart);
            GroceryList weekly=new GroceryList();
            for(GroceryItem item:itemDetails){
                weekly.addItem(item);
            }
            weekly.printMe();
            weekly.totalCost();
            System.out.println("");
            System.out.println("Enter q to EXIT \n c to CONTINUE \n p to change Price \n cq to change Quantity:");
            String userChoice = sc.next();
            if(userChoice.equals("q")){
                break;   
            }
            else if(userChoice.equals("p")){
                changePrice(addToCart);
                break;
            }
            else if(userChoice.equals("cq")){
                changeQuantity(addToCart);
                break;
            }
        }
    }

    public static GroceryItem addToCart(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Fruit:");
        String fruit= sc.next();

        System.out.println("Enter the Price:");
        Double price= sc.nextDouble();

        System.out.println("Enter the Quantity:");
        int quantity= sc.nextInt();
        
        GroceryItem GroceryItem=new GroceryItem(fruit, price, quantity);

        return GroceryItem;
    }
        
    public static void changePrice(GroceryItem addToCart){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the New Price:");
        Double newPrice= sc.nextDouble();

        GroceryItem obj=new GroceryItem(addToCart.name, addToCart.price, addToCart.quantity);
        obj.changePrice(newPrice);
        obj.printMe();

    }
    public static void changeQuantity(GroceryItem addToCart){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the New Quantity:");
        int newPrice= sc.nextInt();

        GroceryItem obj=new GroceryItem(addToCart.name, addToCart.price, addToCart.quantity);
        obj.changeQuantity(newPrice);
        obj.printMe();

    }
}
    

