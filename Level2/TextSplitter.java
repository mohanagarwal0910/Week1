import java.util.Scanner;

public class TextSplitter {

    // Method to split text into words using charAt()
    public static String[] splitText(String text) {
        StringBuilder word = new StringBuilder();
        int wordCount = 0;

        // First, count the number of words
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (word.length() > 0) {
                    wordCount++;
                    word.setLength(0); // Reset the word builder
                }
            } else {
                word.append(ch);
            }
        }
        if (word.length() > 0) wordCount++; // Count the last word

        String[] words = new String[wordCount];
        word.setLength(0); // Reset the word builder for actual words
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (word.length() > 0) {
                    words[index++] = word.toString();
                    word.setLength(0); // Reset for the next word
                }
            } else {
                word.append(ch);
            }
        }
        if (word.length() > 0) words[index] = word.toString(); // Add the last word

        return words;
    }

    // Method to find string length without using length() method
    public static int getStringLength(String str) {
        int length = 0;
        for (char ch : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i]; // Word
            wordLengths[i][1] = String.valueOf(getStringLength(words[i])); // Length as String
        }
        return wordLengths;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scanner.nextLine();

        // Call methods to process the input
        String[] words = splitText(text);
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Display the result in tabular format
        System.out.printf("%-20s %-10s%n", "Word", "Length");
        System.out.println("-------------------- ----------");
        for (String[] wordInfo : wordsWithLengths) {
            System.out.printf("%-20s %-10d%n", wordInfo[0], Integer.parseInt(wordInfo[1]));
        }

    }
}
