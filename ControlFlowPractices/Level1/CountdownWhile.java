import java.util.Scanner;

// Class to count down from user input to 1 using while loop
class CountdownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take countdown start value
        System.out.print("Enter countdown start number: ");
        int counter = input.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // decrement
        }

        System.out.println("Rocket Launched 🚀");

        input.close();
    }
}
