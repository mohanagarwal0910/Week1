import java.util.*;
public class Sum{
     
     public double calculate(int num){
           int sum=0;
           for(int i=0;i<=num;i++){
              sum+=i;
           }
           return sum;
           }
      public static void main (String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number");
           int number=sc.nextInt();
           Sum obj=new Sum();
           System.out.println(obj.calculate(number));
      }
}