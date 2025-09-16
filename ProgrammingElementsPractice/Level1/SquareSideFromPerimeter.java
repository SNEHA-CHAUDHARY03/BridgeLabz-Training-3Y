import java.util.Scanner;

// Class name indicates purpose: SquareSideFromPerimeter
class SquareSideFromPerimeter {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take perimeter input from user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Formula: side = perimeter / 4
        double side = perimeter / 4;

        // Display result
        System.out.println("The length of the side is " + side +
                           " whose perimeter is " + perimeter);

        input.close();
    }
}