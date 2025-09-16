import java.util.Scanner;

// Class to count down from user input to 1 using for loop
class CountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take countdown start value
        System.out.print("Enter countdown start number: ");
        int number = input.nextInt();

        // Countdown using for loop
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Rocket Launched 🚀");

        input.close();
    }
}
