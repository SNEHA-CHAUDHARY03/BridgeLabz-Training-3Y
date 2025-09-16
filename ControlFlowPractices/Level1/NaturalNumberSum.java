import java.util.Scanner;

// Class to check for natural number and print sum of n natural numbers
class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is a natural number
        if (number >= 1) {
            int sum = number * (number + 1) / 2; // Formula
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        input.close();
    }
}
