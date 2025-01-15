import java.util.*;

public class CardDeck {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        
        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        int n = deck.length;

        // Shuffle the deck using the Fisher-Yates shuffle algorithm
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + rand.nextInt(n - i); // Generate a random number between i and n
            // Swap the cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    // Method to distribute the cards to players
    public static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
        if (numCards % numPlayers != 0) {
            System.out.println("Cannot distribute cards evenly. Exiting.");
            return new String[0][0];
        }

        // Create a 2D array to store the cards for each player
        String[][] players = new String[numPlayers][numCards / numPlayers];

        int index = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCards / numPlayers; j++) {
                players[i][j] = deck[index++];
            }
        }

        return players;
    }

    // Method to print the cards of each player
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + " has: ");
            for (String card : players[i]) {
                System.out.print(card + ", ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the deck of cards
        String[] deck = initializeDeck();

        // Shuffle the deck
        deck = shuffleDeck(deck);

        // Get the number of cards and players from user
        System.out.print("Enter the number of cards to distribute to each player: ");
        int numCards = scanner.nextInt();
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();

        // Distribute the cards to the players
        String[][] players = distributeCards(deck, numCards * numPlayers, numPlayers);

        // Print the players and their cards
        if (players.length > 0) {
            printPlayersCards(players);
        }

        scanner.close();
    }
}
