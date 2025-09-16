import java.util.Scanner;

// Class name indicates purpose: FeetToYardsMiles
class FeetToYardsMiles {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceFeet = input.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double distanceYards = distanceFeet / 3.0;

        // Convert yards to miles (1 mile = 1760 yards)
        double distanceMiles = distanceYards / 1760.0;

        // Display result
        System.out.println("The distance " + distanceFeet +
                           " feet is " + distanceYards +
                           " yards and " + distanceMiles + " miles");

        input.close();
    }
}