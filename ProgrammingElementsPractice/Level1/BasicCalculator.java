import java.util.Scanner;

// Class name indicates purpose: BasicCalculator
class BasicCalculator {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take two numbers as input
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display result
        System.out.println("The addition, subtraction, multiplication and division " +
                           "value of 2 numbers " + number1 + " and " + number2 +
                           " is " + addition + ", " + subtraction + ", " + 
                           multiplication + ", and " + division);

        input.close();
    }
}