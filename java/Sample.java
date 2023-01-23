import java.util.ArrayList;
import java.util.List;

public class Sample{

    

    Sample(String tn,int not,double p,String n){
        String ticketName=tn;
        int numOfTicket=not;
        double price=p;
        String numbers=n;

    }
    public static void main(String[] args){
        Sample obj =new Sample("power ball", 2, 4,"12 31 42 23 23 23");
        ArrayList<Sample> a=new ArrayList<Sample>();
        a.add("power ball", 2, 4,"123142232323");
        for(Sample i:a){
            System.out.println(i);
        }

    }
    public static void add(Sample it){

    }

    
    
}