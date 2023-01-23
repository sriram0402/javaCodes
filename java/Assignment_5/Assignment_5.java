import java.util.Scanner;

class Assignment{
    public static void main(String[] args){
        Assignment obj=new Assignment();
        boolean counter=true;
        while(counter){
            Scanner input=new Scanner(System.in);
            System.out.println("q=QUIT, string= enter a string\nq or string:");
            String input1=input.nextLine();

            if(input1.equals("q")){
                System.out.println("GoodBye!!!");
                counter=false;
                break;
            }
            else if(input1.equals("string")){
                System.out.println("enter the string:");
                String data=input.nextLine();
                
                System.out.println("Enter 'reverse' to reverse a string or\n'count' to return no. of vowels in a string or\n'Abecdarian' to check the string\nwhat do you want to do with the string:");
                String whatToDo =input.nextLine();

                if(whatToDo.equals("reverse")){
                    String result=obj.reverseString(data);
                    System.out.println("Reverse of the String:"+result);
                }
                else if(whatToDo.equals("count")){
                    int count=obj.countVowels(data);
                    System.out.println("number of vowels in the String:"+count);
                }
                else if(whatToDo.equals("Abecdarian")){
                    String result=obj.isAbecdarian(data);
                    System.out.println("The string is"+result);
                }

            }
        }
        
    }

    public String reverseString(String data){
        String resultString="";
        for(int i=(data.length())-1;i>=0;i--){
            resultString=resultString+data.charAt(i);
        }
        return resultString; 

    }
    public int countVowels(String data){
        int count=0;
        String vowels="";


        for(int i=0;i<=(data.length())-1;i++){
            if(data.charAt(i)=='a'| data.charAt(i)=='e'| data.charAt(i)=='i'| data.charAt(i)=='o'| data.charAt(i)=='u'){
                count=count+1;
                vowels=vowels+data.charAt(i);
            }
        }
        System.out.println("Vowels in the string are:"+vowels);
        return count;
    }
    public String isAbecdarian(String data){
        
        boolean check=true;

        for(int i=0;i<(data.length())-1;i++){
            if((int)data.charAt(i)<=(int)data.charAt(i+1)){
                check=true;
            }
            else{
                check=false;
            }
        }
        if(check){
            return " Abecdarian";
        }
        else{
            return " Not Abecdarian";
        }

    }
}