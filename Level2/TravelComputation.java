import java.util.Scanner;

public class TravelComputation {
    public static void main(String[] args) {
        // Create a Scanner object to take user inputs
        Scanner scanner = new Scanner(System.in);

        // Take user inputs for name, fromCity, viaCity, and toCity
        System.out.println("Enter the name of the traveler:");
        String name = scanner.nextLine();

        System.out.println("Enter the name of the starting city:");
        String fromCity = scanner.nextLine();

        System.out.println("Enter the name of the via city:");
        String viaCity = scanner.nextLine();

        System.out.println("Enter the name of the final city:");
        String toCity = scanner.nextLine();

        // Take user inputs for distances
        System.out.println("Enter the distance from " + fromCity + " to " + viaCity + " in miles:");
        double distanceFromToVia = scanner.nextDouble();

        System.out.println("Enter the distance from " + viaCity + " to " + toCity + " in miles:");
        double distanceViaToFinalCity = scanner.nextDouble();

        // Take user inputs for time taken
        System.out.println("Enter the time taken from " + fromCity + " to " + viaCity + " in minutes:");
        int timeFromToVia = scanner.nextInt();

        System.out.println("Enter the time taken from " + viaCity + " to " + toCity + " in minutes:");
        int timeViaToFinalCity = scanner.nextInt();

        // Calculate total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Convert total time to hours and minutes
        int totalHours = totalTime / 60;
        int totalMinutes = totalTime % 60;

        // Print the travel details
        System.out.println("\nThe total distance travelled by " + name + " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistance + " miles.");
        System.out.println("The total time taken is " + totalHours + " hours and " + totalMinutes + " minutes.");

        // Close the scanner
        scanner.close();
    }
}
