import java.util.*;
public class Handshakes{
     
     public double calculateHandshakes(int num){
           return (num*(num-1))/2;
           }
      public static void main (String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number of students");
           int number=sc.nextInt();
           Handshakes obj=new Handshakes();
           System.out.println(obj.calculateHandshakes(number));
      }
}