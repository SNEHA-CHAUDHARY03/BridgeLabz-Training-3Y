import java.util.Scanner;

// Class to find the sum until user enters 0 or negative number
class SumUntilNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double value = input.nextDouble();

            if (value <= 0) {
                break; // break if 0 or negative entered
            }

            total += value;
        }

        System.out.println("The total sum is " + total);

        input.close();
    }
}
