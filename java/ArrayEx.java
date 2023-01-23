import java.util.List;
import java.util.Scanner;

import javax.management.relation.InvalidRelationIdException;

public class NumFun {
    public static void main(String[] args){

        int[] arr=new int[100];
        Scanner obj=new Scanner(System.in);
        

        for(int i=0;i<=(arr.length)-1;i++){
        
            arr[i]=(int)(Math.random()*1000);
        }
        
        ArrayEx arrRes=new ArrayEx();
        double avgResult=arrRes.average(arr);
        int largeResult=arrRes.largest(arr);

        System.out.print("Sorted Array:");
        for(int i=0;i<=(arr.length)-1;i++){
            System.out.print(" "+arrRes.sort(arr)[i]);
        }


        System.out.println("");

        System.out.println("Average of num:"+avgResult);
        System.out.println("Largest of num:"+largeResult);

    }
    
    public double average(int[] arr){
        int sum=0;
        for(int i=0;i<=(arr.length)-1;i++){
            sum=arr[i]+sum;
        }
        return (sum/arr.length);

    }

    public int largest(int[] arr){
        int largeNum=0;
        for(int i=0;i<=(arr.length)-1;i++){
            if(arr[i]>=largeNum){
                largeNum=arr[i];
            }
        }
        return largeNum;
    }
    public int[] sort(int[] arr){
        int a;
        int[] counter=new int[100];
        for(int i=0;i<=(arr.length)-2;i++){
            for(int j=i+1;j<=(arr.length)-1;j++){
                if(arr[i]>arr[j]){
                    a=arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
    
                }
            }

        }

        return arr;
    }
}
