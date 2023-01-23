import java.util.ArrayList;
import java.util.Scanner;

public class LotteryMain {

    // LotteryMain(String name,double price,int numOfTickets){
    //     lotteryName=name;
    //     ticketPrice=price;
    // }
    
    public static void main(String args[]){
        LotteryMain mainObj=new LotteryMain();
        mainObj.lotteryInfo();
        // LotteryList listObj=new LotteryList();
        // listObj.printTickets();

    }

    public void lotteryInfo(){


        LotteryList listObj=new LotteryList();

        String lotteryName=" ";
        double ticketPrice=0.0;
        int numOfTickets=0;
        boolean counter=true;

        while(counter){

            Scanner input=new Scanner(System.in);
            System.out.println("Choose the Lottery:\n1.Power Ball\n2.Mega Million\n3.Play 3\n4.Play 4\n5.lotto");
            int userNum=input.nextInt();
            
            if(userNum==1){
                lotteryName="Power ball";
                //ticketNumbers(lotteryName);
    
                System.out.println("Do you want with power play(y/n):");
                String powerPlay=input.next();
                if(powerPlay.equals("y")){
                    lotteryName="Power ball with power play";
                    ticketPrice=3.0;
                }
                else{
                    ticketPrice=2.0;
                }
            }
            else if(userNum==2){
                lotteryName="Mega Million";
                System.out.println("Do you want with Megaplier(y/n):");
                String powerPlay=input.next();
                if(powerPlay.equals("y")){
                    lotteryName="Mega Million with Megaplier";
                    ticketPrice=3.0;
                }
                else{
                    ticketPrice=2.0;
                }
            }
            else if(userNum==3){
                lotteryName="Play 3";
                System.out.println("Do you want with Wild Ball(y/n):");
                String powerPlay=input.next();
                if(powerPlay.equals("y")){
                    lotteryName="Play 3 with wild Ball";
                    ticketPrice=1.0;
                }
                else{
                    ticketPrice=0.5;
                }
    
            }
            else if(userNum==4){
                lotteryName="Play 4";
                System.out.println("Do you want with Wild Ball(y/n):");
                String powerPlay=input.next();
                if(powerPlay.equals("y")){
                    lotteryName="Play 4 with wild Ball";
                    ticketPrice=1.0;
                }
                else{
                    ticketPrice=0.5;
    
                }
            }
            else if(userNum==5){
                lotteryName="lotto";
                ticketPrice=1.0;
            }
    
            System.out.println("Enter No. of Tickets:");
            numOfTickets=input.nextInt();

            LotteryRandomNum obj=new LotteryRandomNum(lotteryName);
            ArrayList<String> res=obj.generateNumbers(lotteryName,numOfTickets);
            
            for(String i:res){
                LotteryTicketList myTickets=new LotteryTicketList(lotteryName, numOfTickets, i, ticketPrice);
                listObj.addToList(myTickets);
            }

            listObj.printTickets();
            System.out.println("Do you want to continue(Y/n):");
            String userInput=input.next();

            if(userInput.equals("n")){
                // LotteryList listOnbj=new LotteryList();
                listObj.printTickets();
                break;
            }
            // LotteryMain ticketInfo=new LotteryMain(lotteryName, ticketPrice, numOfTickets);
            // return ticketInfo;
        }

            
        }

        
}