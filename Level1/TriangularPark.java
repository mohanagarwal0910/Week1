import java.util.*;
public class TriangularPark{
     
     public int rounds(int f,int s,int t){
           return 5000/(f+s+t);
           }
      public static void main (String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the first side");
           int first=sc.nextInt();
           System.out.println("Enter the second side");
           int second=sc.nextInt();
           System.out.println("Enter the third side");
           int third=sc.nextInt();
           TriangularPark obj=new TriangularPark();
           System.out.println(obj.rounds(first,second,third));
      }
}