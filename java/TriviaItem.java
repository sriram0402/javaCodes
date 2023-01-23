import java.util.ArrayList;

public class TriviaItem {
    String question;
    String answer;

    ArrayList<String> choices;

    TriviaItem(){
        question="";
        answer="";
        choices=new ArrayList<String>();
    }

    void printMe(){
        System.out.printf("%s %s ",question, answer);
        for(String c:choices){
            System.out.printf("%s",c);

        }
        System.out.println("");
    }
    
}
