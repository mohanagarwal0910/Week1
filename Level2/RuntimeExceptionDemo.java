import java.util.Scanner;

public class RuntimeExceptionDemo {

    public static void generateException(String str) {
        int count=0;
        try {
            
            for(int i=0;i>=0;i++){
                    str.charAt(count);
                    count++;
                 
              }
            } 
        catch (RuntimeException e) {
            //System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
       System.out.println("The length of string without using buildin function"+count);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input string
        System.out.print("Enter the string: ");
        String str = scanner.next();

        System.out.println("\nDemonstrating exception generation:");
        try {
            generateException(str);
        } catch (RuntimeException e) {
            System.out.println("Caught an RuntimeException in main: " + e.getMessage());
        }
         int length=str.length();
         System.out.println("The length of string using buildin function"+length);          
 
       
    }
}
