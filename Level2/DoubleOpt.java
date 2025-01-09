import java.util.*;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter the value for a:");
        a = scanner.nextDouble();
        System.out.println("Enter the value for b:");
        b = scanner.nextDouble();
        System.out.println("Enter the value for c:");
        c = scanner.nextDouble();
        double result1 = a + b * c; 
        double result2 = a * b + c;
        double result3 = c + a / b; 
        double result4 = a % b + c; 
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}
