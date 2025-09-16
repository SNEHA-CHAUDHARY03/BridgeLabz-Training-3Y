import java.util.Scanner;

// Class name indicates purpose: KmToMilesInput
class KmToMilesInput {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take distance in kilometers as user input
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Conversion factor: 1 mile = 1.6 km
        double miles = km / 1.6;

        // Display result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
        input.close();
    }
}