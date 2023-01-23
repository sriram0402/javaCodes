import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
public class TriviaMain {
    public static void main(String[] args)throws Exception{
        Scanner input=new Scanner(System.in);
        TriviaItem temp=new TriviaItem();
        temp.question="question";
        temp.answer="answer";

        temp.choices.add("choice 1");
        temp.choices.add("choice 2");

        temp.printMe();

        FileReader file = new FileReader("/Users/sriram/Downloads/short.txt");
        BufferedReader inBuf=new BufferedReader(file);
        String line=inBuf.readLine();
        while(line.length() != 0 && (line.startsWith("^"))){
            System.out.println(line);
            line=inBuf.readLine();

            if(line.length() == 0){
                System.out.println("Enter the answer:");
                String ans=input.next();
                checkAnswer(ans);
            }
        }
        
    }

    public static void checkAnswer(String ans){
        ArrayList<String> answers=new ArrayList<>();
        answers.add(ans);

    }
    
}
