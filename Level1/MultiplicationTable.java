import java.util.*;
public class MultiplicationTable{
     public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int number[]=new int[10];
     for(int i=0;i<number.length;i++){
          number[i]=num*(i+1);
          }
     for(int i=0;i<number.length;i++){
          System.out.println(num +"* "+(i+1)+" = "+ number[i]);
          }
  }
}
