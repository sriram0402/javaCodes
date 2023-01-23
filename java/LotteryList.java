import java.util.ArrayList;

public class LotteryList {


    ArrayList<LotteryTicketList> myList=new ArrayList<>();

    public void addToList(LotteryTicketList ls){
        myList.add(ls);
    }
        


    public void printTickets(){
        double totalPrice=0.0;
        for(LotteryTicketList i:myList){
            totalPrice=i.price+totalPrice;
            System.out.println(i.ticketName+" Numbers:"+i.lotteryNumbers);
        }
        System.out.println("Total Price:"+totalPrice);
    }


}



