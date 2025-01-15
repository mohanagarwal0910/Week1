import java.util.*;

public class SplitTextComparison {

    //Calculating the length of a string without using the built-in length() method
    public static int getStringLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to split the string into words without using the built-in split() method
    public static String[] splitText(String text) {
        int textLength = getStringLength(text);
        int wordCount = 0;

        // Count the number of words by identifying spaces and word boundaries
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ' || i == textLength - 1) {
                wordCount++;
            }
        }

        // Array to store words
        String[] words = new String[wordCount];
        int wordStart = 0, wordIndex = 0;

        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ' || i == textLength - 1) {
                // Extract the word
                int wordEnd = (i == textLength - 1) ? i + 1 : i;
                StringBuilder word = new StringBuilder();
                for (int j = wordStart; j < wordEnd; j++) {
                    word.append(text.charAt(j));
                }
                words[wordIndex++] = word.toString();
                wordStart = i + 1;
            }
        }
        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input 
        System.out.println("Enter a sentence:");
        String text = scanner.nextLine();

        // Split using the user-defined method
        String[] customSplitWords = splitText(text);

        // Split using the built-in split() method
        String[] builtInSplitWords = text.split(" ");

        // Compare the results
        boolean areEqual = compareArrays(customSplitWords, builtInSplitWords);

        // Display the results
        System.out.println("Words using custom split method: " +        Arrays.toString(customSplitWords));
        System.out.println("Words using built-in split method: " + Arrays.toString(builtInSplitWords));
        System.out.println("Are both methods producing the same result? " + areEqual);
    }
}
