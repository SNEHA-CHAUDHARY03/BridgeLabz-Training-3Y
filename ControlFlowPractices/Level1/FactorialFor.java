import java.util.Scanner;

// Class to find factorial using for loop
class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take integer input
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        if (n >= 0) {
            int factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("The factorial of " + n + " is " + factorial);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        input.close();
    }
}
