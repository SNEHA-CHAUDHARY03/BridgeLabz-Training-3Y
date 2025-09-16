import java.util.Scanner;

// Class to find factorial using while loop
class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take integer input
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        if (n >= 0) {
            int factorial = 1;
            int i = 1;

            while (i <= n) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + n + " is " + factorial);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        input.close();
    }
}
