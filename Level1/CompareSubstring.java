import java.util.Scanner;
class CompareSubstring{
  public static String compute(String str1,int start,int end) {
    String res="";
    for (int i = start; i < end; i++) {
         res+=str1.charAt(i);
     }

   return res;
  }
  public static String compute2(String str1,int start,int end) {
    String res2=str1.substring(start,end);
    return res2;
  }

  

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);      
    System.out.println("Enter string: ");
    String str1 = sc.next();
    System.out.println("Enter starting index: ");
    int start=sc.nextInt();
    System.out.println("Enter ending index: ");
    int end=sc.nextInt();
    String result1=compute(str1,start,end);
    System.out.println(result1);
    String result2=compute(str1,start,end);
    System.out.println(result2);
    if(result1.equals(result2))
     System.out.println("Both give the same output");
    else
      System.out.println("Both does not give the same output");
    
  }
}