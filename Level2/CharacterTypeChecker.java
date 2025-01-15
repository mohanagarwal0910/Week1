import java.util.Scanner;

public class CharacterTypeChecker {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert to lowercase using ASCII logic
        if (ch >= 'A' && ch <= 'Z') {
            ch += 32; // Convert to lowercase
        }

        // Check if the character is a letter
        if (ch >= 'a' && ch <= 'z') {
            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to find the type of characters in a string and store in a 2D array
    public static String[][] findCharacterTypes(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = checkCharacterType(ch);
            result[i][0] = String.valueOf(ch); // Store character as a string
            result[i][1] = type; // Store the type (Vowel, Consonant, or Not a Letter)
        }
        return result;
    }

    // Method to display a 2D array in a tabular format
    public static void displayCharacterTypes(String[][] data) {
        System.out.println("\nCharacter Type Table:");
        System.out.println("----------------------------");
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("----------------------------");

        for (String[] row : data) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }

        System.out.println("----------------------------");
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Find character types
        String[][] characterTypes = findCharacterTypes(input);

        // Display results in tabular format
        displayCharacterTypes(characterTypes);
    }
}
