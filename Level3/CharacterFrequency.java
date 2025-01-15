import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        // Array to store frequency of each character (256 for ASCII characters)
        int[] frequency = new int[256];

        // Calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Array to store characters and their frequencies
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Fill the result array with characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }

        return result;
    }

    // Method to display the frequency results in a tabular format
    public static void displayFrequency(String[][] result) {
        System.out.println("Character Frequency:");
        System.out.println("-----------------------------");
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("-----------------------------");

        for (String[] entry : result) {
            System.out.printf("%-10s %-10s%n", entry[0], entry[1]);
        }

        System.out.println("-----------------------------");
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find the character frequencies
        String[][] frequencyResult = findCharacterFrequency(inputText);

        // Display the frequency of characters
        displayFrequency(frequencyResult);
    }
}
