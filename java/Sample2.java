import java.math.*;
import java.util.Scanner;
public class Sample2{
    public static void main(String[] args){

        Sample2 obj=new Sample2();
        boolean res=obj.isAbcedarian();

        System.out.print(res);
    }

    public String[] evenOdd(String data){
        
        String[] results=new String[2];

        results[0]="";
        results[1]="";
        for(int i=0;i<=(data.length())-1;i++){
            if(i%2==0){
                
                results[0]=results[0]+data.charAt(i);

            }
            else{
                
                results[1]=results[1]+data.charAt(i);
            }
        }
        return results;
    }

    public boolean isAbcedarian(){

        boolean result=false;
        String a="abcdefghijk";
        int[] num=new int[a.length()];

        for(int i=0;i<a.length();i++){
            num[i]=(int)a.charAt(i);
        }
        for(int i=0;i<(a.length())-1;i++){
            if(num[i]<=num[i+1]){
                result=true;
            }
            else{
                result=false;
                break;
            }
        }
        return result;

    }
}