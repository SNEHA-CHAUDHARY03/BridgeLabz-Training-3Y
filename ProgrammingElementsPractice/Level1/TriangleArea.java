import java.util.Scanner;

// Class name indicates purpose: TriangleArea
class TriangleArea {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take base and height in centimeters
        System.out.print("Enter base of triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height of triangle in cm: ");
        double height = input.nextDouble();

        // Area in square centimeters
        double areaCm2 = 0.5 * base * height;

        // Convert cm² to inch² (1 inch = 2.54 cm → 1 cm² = (1/2.54)² inch²)
        double areaInch2 = areaCm2 / (2.54 * 2.54);

        // Display result
        System.out.println("The area of triangle is " + areaCm2 +
                           " square centimeters and " + String.format("%.2f", areaInch2) +
                           " square inches");

        input.close();
    }
}