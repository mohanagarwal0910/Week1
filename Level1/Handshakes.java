import java.util.*;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate the maximum number of handshakes using the combination formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output the number of possible handshakes
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes);
    }
}
