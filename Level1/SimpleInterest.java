import java.util.*;
public class SimpleInterest{
     
     public double calculateSI(int p,int r,int t){
           return (p*r*t)/100;
           }
      public static void main (String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the principal");
           int principal=sc.nextInt();
           System.out.println("Enter the rate");
           int rate=sc.nextInt();
           System.out.println("Enter the time");
           int time=sc.nextInt();
           SimpleInterest obj=new SimpleInterest();
           System.out.println(obj.calculateSI(principal,rate,time));
      }
}