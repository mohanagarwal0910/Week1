import java.util.Scanner;
public class StringCharacterComparison {
    public static char[] getCharactersWithoutToCharArray(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i] || array1.length != array2.length ) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.next();
        char[] userDefinedCharArray = getCharactersWithoutToCharArray(userInput);
        char[] builtInCharArray = userInput.toCharArray();
        boolean areArraysEqual = compareCharArrays(userDefinedCharArray, builtInCharArray);
        System.out.println("Are both character arrays equal? " + areArraysEqual);
    }
}
