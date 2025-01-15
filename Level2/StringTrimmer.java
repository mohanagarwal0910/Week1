import java.util.Scanner;

public class StringTrimmer {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] findTrimIndices(String text) {
        int start = 0, end = text.length() - 1;

        // Find the first non-space character
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt() method
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string with leading and trailing spaces:");
        String input = scanner.nextLine();

        // Trim spaces using custom logic
        int[] trimIndices = findTrimIndices(input);
        String trimmedCustom = createSubstring(input, trimIndices[0], trimIndices[1]);

        // Trim spaces using String's built-in trim() method
        String trimmedBuiltIn = input.trim();

        // Compare the two trimmed strings
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display results
        System.out.println("\nResults:");
        System.out.println("Original String: \"" + input + "\"");
        System.out.println("Custom Trimmed String: \"" + trimmedCustom + "\"");
        System.out.println("Built-in Trimmed String: \"" + trimmedBuiltIn + "\"");
        System.out.println("Are the two trimmed strings equal? " + areEqual);
    }
}
