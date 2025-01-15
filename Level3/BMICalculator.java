import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] data) {
        String[][] results = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInMeters = heightInCm / 100.0;

            // Calculate BMI
            double bmi = weight / (heightInMeters * heightInMeters);

            // Determine BMI status
            String status;
            if (bmi < 18.4) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi < 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store results
            results[i][0] = String.format("%.2f", weight); // Weight
            results[i][1] = String.format("%.2f", heightInCm); // Height
            results[i][2] = String.format("%.2f", bmi); // BMI
            results[i][3] = status; // Status
        }

        return results;
    }

    // Method to display the 2D String array in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("\nBMI Results:");
        System.out.println("----------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-20s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("----------------------------------------------------");

        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-20s%n", row[0], row[1], row[2], row[3]);
        }

        System.out.println("----------------------------------------------------");
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] heightWeightData = new double[10][2];

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d:%n", i + 1);
            System.out.print("Weight (kg): ");
            heightWeightData[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            heightWeightData[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and status
        String[][] bmiResults = calculateBMI(heightWeightData);

        // Display results
        displayResults(bmiResults);
    }
}
