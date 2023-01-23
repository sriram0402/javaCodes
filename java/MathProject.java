/* Online Java Compiler and Editor */
import java.math.*;
public class MathProject{

  public static void main(String []args){
     System.out.println("Hello, World!");
     MathProject obj=new MathProject();
     obj.countXX("xxxxx");
     
  }
  
  
  
 public double countXX(String str) {
 double count=0;
 char[] ch = new char[str.length()];
for(int i=0;i<=(str.length())-1;i++){
 ch[i] = str.charAt(i); 
 System.out.println(ch[i]);
}

for(int i=0;i<=(str.length())-1;i++){
 if(ch[i]=='x'){
   count=count+1;
 }
}
System.out.println(Math.ceil(count/2));
return count;
}

}