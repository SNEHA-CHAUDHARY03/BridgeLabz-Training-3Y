import java.util.Scanner;

// Class to find sum of n natural numbers using formula and while loop, compare results
class NaturalNumberSumCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input n
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if (n >= 1) {
            // Formula method
            int formulaSum = n * (n + 1) / 2;

            // While loop method
            int loopSum = 0, i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            // Compare results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);
            System.out.println("Both results are " + (formulaSum == loopSum));
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        input.close();
    }
}
