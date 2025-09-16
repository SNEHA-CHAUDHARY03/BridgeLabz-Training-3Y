import java.util.Scanner;

// Class name indicates purpose: MaximumHandshakes
class MaximumHandshakes {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take number of students as input
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Formula for maximum handshakes = n * (n - 1) / 2
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display result
        System.out.println("The maximum number of possible handshakes among " +
                           numberOfStudents + " students is " + handshakes);

        input.close();
    }
}