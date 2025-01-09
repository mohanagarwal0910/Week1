import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the first number ");
        double number1 = scanner.nextDouble();

        // Taking user input for the second number
        System.out.print("Enter the second number  ");
        double number2 = scanner.nextDouble();

        // Swap the numbers
        double temp = number1;
        number1 = number2;	
        number2 = temp;

        // Print the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

       
    }
}