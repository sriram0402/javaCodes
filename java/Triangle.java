import java.util.Scanner;

class Triangle{
    public static void main(String []args){

        Scanner obj = new Scanner(System.in);
        
        System.out.println("enter a value:");
        int a = obj.nextInt();

        System.out.println("enter b value:");
        int b = obj.nextInt();

        System.out.println("enter c value:");
        int c = obj.nextInt();

        //Triangle obj2=new Triangle();
        Triangle.triangleTest(a, b, c);
        if(Triangle.triangleTest(a, b, c)==true){
            System.out.println("we can create a triangle with the sides");
        }
        else{
            System.out.println("we can't create a triangle with the sides");
        }

    }

    public static boolean triangleTest(int a, int b, int c){
        
        if(a+b>c){
            return true;
        }
        else if(b+c>a){
            return true;
        }
        else if(b+c>b){
            return true;
        }
        else{
            return false;
        }
    }
}