import java.util.Scanner;

// Class to convert feet to yards and miles
class DistanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInYards / 1760.0;

        System.out.println("The distance is " + String.format("%.2f", distanceInYards) +
            " yards and " + String.format("%.4f", distanceInMiles) + " miles for " +
            distanceInFeet + " feet.");

        input.close();
    }
}