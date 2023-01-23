import java.util.*;
public class Banking2{

    public static void main(String[] args){
        double currentBalance,depositAmt,withDrawAmt;
        Scanner obj= new Scanner(System.in);

        System.out.println("Enter your current balance:");
        currentBalance = obj.nextDouble();
        System.out.println("Your current balance is "+String.format("%.2f",currentBalance)+"$");
        
        System.out.println("Enter the amount you want to deposit:");
        depositAmt = obj.nextDouble();

        currentBalance=currentBalance+depositAmt;
        System.out.println("you deposited"+depositAmt+"$, your updated current balance: "+currentBalance);

        System.out.println("Enter the amount you want to withdraw:");
        withDrawAmt = obj.nextDouble();
        if(withDrawAmt<=currentBalance){     
            currentBalance=currentBalance-withDrawAmt;
            System.out.println("you withdrawn"+withDrawAmt+"$, your updated current balance: "+currentBalance);
        }
        else{
            System.out.println("you Don't have enough balance in your account");
        }
        


    }
}