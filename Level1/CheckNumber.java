import java.util.*;
public class CheckNumber{
     
     public int check(int num){
           if(num>0)
             return 1;
           else if(num<0)
             return -1;
           else
             return 0;
           }
      public static void main (String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number");
           int number=sc.nextInt();
           CheckNumber obj=new CheckNumber();
           System.out.println(obj.check(number));
      }
}