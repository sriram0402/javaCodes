import java.util.Random;
public class DiceClass {
    public static void main(String[] args){
        printDiceValue();
    }
    public static void printDiceValue(){
        int res=rollDice();
        System.out.println("the Dice values is: "+res);

    }
    public static int rollDice(){

        int num=(int)(Math.random()*6);
        return num;
    }
    
}
