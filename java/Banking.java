import java.util.Scanner;

public class Banking {

    public static void main(String[] args){
        double currentBalance=1000.9912;
        double depositAmt=50.50;
        double withDrawAmt=500;
        Scanner input = new Scanner(System.in);

        System.out.println("STARTING VALUES");
        System.out.println("your Current Balance:"+String.format("%.2f", currentBalance)+"$");
        System.out.println("Deposit Amount:"+String.format("%.2f", depositAmt)+"$");
        System.out.println("With Draw Amount:"+String.format("%.2f", withDrawAmt)+"$\n");

        
        System.out.println("Enter the amount you want to deposit:");
        double depositAmount=input.nextDouble();
        currentBalance=currentBalance+depositAmount;
        System.out.println("Your total amount after depositing "+depositAmount+"is:"+String.format("%.2f", currentBalance)+"$");

        System.out.println("Enter the amount you want to withdraw:");
        double withDrawAmount = input.nextDouble();
        currentBalance=currentBalance-withDrawAmount;
        System.out.println("Current Balance after with drawing "+withDrawAmount+"$ is:"+String.format("%.2f", currentBalance)+"$");
    }
    
}
