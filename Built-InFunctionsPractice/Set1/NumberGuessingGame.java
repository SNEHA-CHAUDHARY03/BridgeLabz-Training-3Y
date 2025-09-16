import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    static Scanner sc = new Scanner(System.in);

    static int generateGuess(int low, int high) {
        return low + new Random().nextInt(high - low + 1);
    }

    static String getUserFeedback(int guess) {
        System.out.print("Is your number " + guess + "? (Enter 'high', 'low', or 'correct'): ");
        return sc.next().toLowerCase();
    }

    public static void main(String[] args) {
        int low = 1, high = 100;
        System.out.println("Think of a number between 1 and 100.");
        while (low <= high) {
            int guess = generateGuess(low, high);
            String feedback = getUserFeedback(guess);
            if (feedback.equals("correct")) {
                System.out.println("Guessed correctly!");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input.");
            }
        }
    }
}
