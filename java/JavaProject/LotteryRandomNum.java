import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class LotteryRandomNum {
    String lotteryName;
    double totalCost;
    LotteryRandomNum(String name){
        lotteryName=name;
    }

    public static void main(String args[]){
        // LotteryRandomNum obj=new LotteryRandomNum("Power ball");
        // ArrayList<String> res=obj.generateNumbers("Power ball",3);
        // for(String i:res){
        //     System.out.println(i);
        // }

    }
    public ArrayList<String> generateNumbers(String lotteryName,int numOfTickets){
        
        ArrayList<String> num=new ArrayList<>();
        if(lotteryName.equals("Power ball")||lotteryName.equals("Power ball with power play")){
            for(int j=0;j<numOfTickets;j++){
                String strNum="";
                int upperLimit=69;
                for(int i=0;i<=5;i++){
                    if(i==5){
                        upperLimit=26;
                    }
                    Integer a=(int)(Math.random()*upperLimit)+1;
                    strNum=strNum+a.toString();
                    strNum=strNum+" ";
                }
                num.add(j,strNum);
            }
        }

        else if(lotteryName.equals("Mega Million")||lotteryName.equals("Mega Million with Megaplier")){
            for(int j=0;j<numOfTickets;j++){
                String strNum="";
                int upperLimit=70;

                for(int i=0;i<=5;i++){
                    if(i==5){
                        upperLimit=25;
                    }
                    Integer a=(int)(Math.random()*upperLimit)+1;
                    strNum=strNum+a.toString();
                    strNum=strNum+" ";
                }
                num.add(j,strNum);
            }
        }

        else if(lotteryName.equals("Play 3")||lotteryName.equals("Play 3 with wild Ball")){
            for(int j=0;j<numOfTickets;j++){
                String strNum="";
                int upperLimit=9;

                for(int i=0;i<=2;i++){
                    Integer a=(int)(Math.random()*upperLimit)+1;
                    strNum=strNum+a.toString();
                    strNum=strNum+" ";
                }
                num.add(j,strNum);
            }
        }
        else if(lotteryName.equals("Play 4")||lotteryName.equals("Play 4 with wild Ball")){
            for(int j=0;j<numOfTickets;j++){
                String strNum="";
                int upperLimit=9;

                for(int i=0;i<=3;i++){
                    Integer a=(int)(Math.random()*upperLimit)+1;
                    strNum=strNum+a.toString();
                    strNum=strNum+" ";
                }
                num.add(j,strNum);
            }
        }
        else if(lotteryName.equals("lotto")){
            for(int j=0;j<numOfTickets;j++){
                String strNum="";
                int upperLimit=44;

                for(int i=0;i<=5;i++){
                    if(i==5){
                        upperLimit=25;
                    }
                    Integer a=(int)(Math.random()*upperLimit)+1;
                    strNum=strNum+a.toString();
                    strNum=strNum+" ";
                }
                num.add(j,strNum);
            }
        }
        return num;

    }

}
