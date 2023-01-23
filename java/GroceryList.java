
import java.util.ArrayList;
public class GroceryList {


    ArrayList<GroceryItem> myList;

    GroceryList(){
        myList=new ArrayList<GroceryItem>();
    }
    public void addItem(GroceryItem it){
        myList.add(it);

    }

    public void printMe(){
        for(GroceryItem item:myList){
            item.printMe();
        }
    }

    public void totalCost(){
        double total=0;
        for(GroceryItem item:myList){
            total=total+(item.price*item.quantity);
        }
        System.out.printf("total cost:%.2f",total,"\n");
    }
}
