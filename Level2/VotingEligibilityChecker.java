import java.util.Random;

public class VotingEligibilityChecker {

    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10; // Random age between 10 and 99
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            results[i][0] = String.valueOf(age); // Store age as string

            if (age < 0) {
                results[i][1] = "Cannot Vote (Invalid Age)";
            } else if (age >= 18) {
                results[i][1] = "Can Vote";
            } else {
                results[i][1] = "Cannot Vote";
            }
        }
        return results;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] data) {
        System.out.println("\nVoting Eligibility Table:");
        System.out.println("---------------------------------------");
        System.out.printf("%-10s %-20s%n", "Age", "Voting Eligibility");
        System.out.println("---------------------------------------");

        for (String[] row : data) {
            System.out.printf("%-10s %-20s%n", row[0], row[1]);
        }

        System.out.println("---------------------------------------");
    }

    // Main method
    public static void main(String[] args) {
        int numberOfStudents = 10;

        // Generate random ages
        int[] ages = generateAges(numberOfStudents);

        // Check voting eligibility
        String[][] eligibilityResults = checkVotingEligibility(ages);

        // Display results
        displayResults(eligibilityResults);
    }
}
