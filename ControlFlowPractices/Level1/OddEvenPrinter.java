import java.util.Scanner;

// Class to print odd and even numbers between 1 and user-entered number
class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take integer input
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        input.close();
    }
}
