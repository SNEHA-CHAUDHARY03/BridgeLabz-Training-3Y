import java.util.Scanner;

// Class to check if a number is divisible by 5
class DivisibleByFive {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get input value for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check divisibility by 5 using modulus operator
        boolean isDivisible = (number % 5 == 0);

        // Display result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        // Close the Scanner object
        input.close();
    }
}
