import java.util.Scanner;

// Class to check if the first number is the smallest among three
class SmallestCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take 3 numbers from user
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        // Check if first number is smallest
        boolean isSmallest = (number1 < number2 && number1 < number3);

        // Output
        System.out.println("Is the first number the smallest? " + isSmallest);

        input.close();
    }
}
