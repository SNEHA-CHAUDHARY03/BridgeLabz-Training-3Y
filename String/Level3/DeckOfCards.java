import java.util.Scanner;

public class DeckOfCards {
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    static String[] initDeck() {
        String[] deck = new String[suits.length * ranks.length];
        int idx = 0;
        for (String suit : suits)
            for (String rank : ranks)
                deck[idx++] = rank + " of " + suit;
        return deck;
    }

    static void shuffle(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    static String[][] distribute(String[] deck, int nCards, int nPlayers) {
        if (nCards * nPlayers > deck.length) return null;
        String[][] players = new String[nPlayers][nCards];
        int idx = 0;
        for (int i = 0; i < nPlayers; i++)
            for (int j = 0; j < nCards; j++)
                players[i][j] = deck[idx++];
        return players;
    }

    static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i+1) + ": ");
            for (String card : players[i]) System.out.print(card + ", ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initDeck();
        shuffle(deck);
        System.out.print("Enter number of players: ");
        int nPlayers = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int nCards = sc.nextInt();
        String[][] players = distribute(deck, nCards, nPlayers);
        if (players == null) System.out.println("Not enough cards to distribute.");
        else printPlayers(players);
    }
}
