import java.util.Scanner;

// Class to find sum of n natural numbers using formula and for loop, compare results
class NaturalNumberSumFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if (n >= 1) {
            // Formula method
            int formulaSum = n * (n + 1) / 2;

            // For loop method
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Compare
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);
            System.out.println("Both results are " + (formulaSum == loopSum));
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        input.close();
    }
}
