import java.util.*;
class QuotientReminder{
     public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         double firstNumber=sc.nextInt();
         double secondNumber=sc.nextInt();
         double quotient = firstNumber/secondNumber;
         double remainder = firstNumber%secondNumber;
         System.out.println("The Quotient is"+ quotient+ "and Reminder is"+ remainder+ " of two number"+ firstNumber+ "and" + secondNumber);
}
}