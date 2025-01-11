import java.util.Random;

public class FootballTeamHeights {

    public static void main(String[] args) {
        // Create an int array of size 11
        int[] heights = new int[11];
        Random random = new Random();

        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101); // 101 = (250 - 150) + 1
        }

        // Display the heights
        System.out.println("Heights of players (in cms):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Calculate and display results
        int sum = calculateSum(heights);
        double mean = calculateMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("\nResults:");
        System.out.println("Shortest Height: " + shortest + " cms");
        System.out.println("Tallest Height: " + tallest + " cms");
        System.out.println("Mean Height: " + mean + " cms");
    }

    // Method to calculate the sum of all elements in the array
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double calculateMean(int sum, int count) {
        return (double) sum / count;
    }

    // Method to find the shortest height
    public static int findShortest(int[] array) {
        int shortest = array[0];
        for (int value : array) {
            if (value < shortest) {
                shortest = value;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] array) {
        int tallest = array[0];
        for (int value : array) {
            if (value > tallest) {
                tallest = value;
            }
        }
        return tallest;
    }
}
