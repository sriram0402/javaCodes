import java.lang.*;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class GroceryItem {
    String name;
    double price;
    int quantity;

    GroceryItem(String n,double p, int q){
        name=n;
        price=p;
        quantity=q;
    }

    public void printMe(){
        System.out.printf("%s $%.2f quantity=%d\n",name,price,quantity);
    }

    public void changePrice(Double newPrice){
        price=newPrice;
    }

    public void changeQuantity(int newQuantity){
        quantity=newQuantity;
    }

    public double itemCost(){
        return price*quantity;
    }


    
}
