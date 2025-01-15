import java.util.Scanner;

public class TextProcessor {

    // Method to split the text into words using charAt()
    public static String[] splitText(String text) {
        StringBuilder word = new StringBuilder();
        int wordCount = 0;

        // Count words first
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (word.length() > 0) {
                    wordCount++;
                    word.setLength(0);
                }
            } else {
                word.append(ch);
            }
        }
        if (word.length() > 0) wordCount++; // Last word count

        String[] words = new String[wordCount];
        word.setLength(0); // Reset for word collection
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (word.length() > 0) {
                    words[index++] = word.toString();
                    word.setLength(0);
                }
            } else {
                word.append(ch);
            }
        }
        if (word.length() > 0) words[index] = word.toString(); // Last word

        return words;
    }

    // Method to calculate string length without using length() method
    public static int findLength(String str) {
        int length = 0;
        for (char ch : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to create a 2D String array of words and their lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Method to find the shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordData) {
        String shortest = wordData[0][0];
        String longest = wordData[0][0];
        int shortestLength = Integer.parseInt(wordData[0][1]);
        int longestLength = Integer.parseInt(wordData[0][1]);

        for (String[] word : wordData) {
            int length = Integer.parseInt(word[1]);
            if (length < shortestLength) {
                shortest = word[0];
                shortestLength = length;
            }
            if (length > longestLength) {
                longest = word[0];
                longestLength = length;
            }
        }

        return new String[]{shortest, longest};
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text:");
        String text = scanner.nextLine();

        // Split text into words
        String[] words = splitText(text);

        // Get words and their lengths
        String[][] wordData = getWordsAndLengths(words);

        // Find the shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(wordData);

        // Display results
        System.out.println("\nWords and their lengths:");
        for (String[] word : wordData) {
            System.out.println(word[0] + " - " + word[1]);
        }

        System.out.println("\nShortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);
    }
}
