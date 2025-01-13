import java.util.Scanner;
class Compare{
  public static boolean compare(String name1, String name2) {
    for (int i = 0; i < name1.length(); i++) {
        if(name1.charAt(i)!=name2.charAt(i) || name1.length()!=name2.length() )
           return false;
    }

   return true;
  }
  public static boolean compare2(String name1, String name2) {
    if(name1.equals(name2))
    return true;
    else
     return false;
   }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);      
    System.out.println("Enter first string: ");
    String name1 = sc.next();
    System.out.println("Enter second string: ");
    String name2 = sc.next();  
    boolean result1=compare(name1,name2);
    System.out.println(result1);
    boolean result2=compare2(name1,name2);
    System.out.println(result2);
    if(result1 && result2)
      System.out.println("true");
    else
      System.out.println("false");

    
  }
}
