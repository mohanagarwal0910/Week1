import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the value for a:");
        a = scanner.nextInt();
        System.out.println("Enter the value for b:");
        b = scanner.nextInt();
        System.out.println("Enter the value for c:");
        c = scanner.nextInt();
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b; 
        int result4 = a % b + c;
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}
