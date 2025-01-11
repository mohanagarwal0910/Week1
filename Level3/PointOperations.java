import java.util.Scanner;

public class PointOperations {

    // Method to calculate the Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the slope (m) and y-intercept (b) of the line
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1); // Slope calculation
        double b = y1 - m * x1;          // Y-intercept calculation
        return new double[]{m, b};       // Return slope and intercept as an array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input points from the user
        System.out.println("Enter x1 and y1 for the first point:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter x2 and y2 for the second point:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Calculate and display the Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between the points: %.2f%n", distance);

        // Calculate and display the equation of the line
        if (x1 != x2) { // Avoid division by zero for a vertical line
            double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
            double slope = lineEquation[0];
            double yIntercept = lineEquation[1];
            System.out.printf("Equation of the line: y = %.2f*x + %.2f%n", slope, yIntercept);
        } else {
            System.out.println("The line is vertical with equation x = " + x1);
        }

        scanner.close();
    }
}
