import java.util.Scanner;

// Class to check if a number is positive, negative, or zero
class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check conditions
        if (number > 0) {
            System.out.println("The number " + number + " is Positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        input.close();
    }
}
