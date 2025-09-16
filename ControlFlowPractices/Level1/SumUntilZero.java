import java.util.Scanner;

// Class to find the sum of numbers until user enters 0
class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize total
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double value = input.nextDouble();

            if (value == 0) {
                break; // stop if user enters 0
            }

            total += value; // add to total
        }

        System.out.println("The total sum is " + total);

        input.close();
    }
}
