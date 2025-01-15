import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check if a character is a vowel or consonant
    public static String checkVowelOrConsonant(char ch) {
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

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String result = checkVowelOrConsonant(ch);

            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }
        return new int[]{vowelCount, consonantCount};
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Count vowels and consonants
        int[] counts = countVowelsAndConsonants(input);

        // Display results
        System.out.println("\nResult:");
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }
}
