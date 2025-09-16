import java.util.Scanner;

class MultiplesWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input. Enter a number between 1 and 99.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
            int counter = 1;
            while (counter < 100) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        }

        input.close();
    }
}