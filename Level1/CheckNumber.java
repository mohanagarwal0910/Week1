import java.util.*;
public class CheckNumber{
     public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int number[]=new int[5];
     for(int i=0;i<number.length;i++){
          number[i]=sc.nextInt();
          }
      for(int i=0;i<number.length;i++){
          if(number[i]>0jav ){
             if(number[i]%2==0)
               System.out.println(number[i] + " is a positive even number.");
             else
               System.out.println(number[i] + " is a positive odd number.");
           }
          else if(number[i]<0)
             System.out.println(number[i] + " is a negative number.");
          else
             System.out.println(number[i] + " is a zero number.");
        }
      if(number[0]==number[4])
          System.out.println("First and last number is equal.");
      else if(number[0]>number[4])
          System.out.println("First number is greater than last number.");
      else
          System.out.println("First number is smaller than last number.");
     }
}