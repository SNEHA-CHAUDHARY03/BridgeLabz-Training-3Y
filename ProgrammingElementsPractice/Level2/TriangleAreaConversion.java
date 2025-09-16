import java.util.Scanner;

// Class to compute area of triangle in cm² and inch²
class TriangleAreaConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height of triangle in cm: ");
        double height = input.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaInch2 = areaCm2 / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " +
            String.format("%.2f", areaInch2) +
            " and sq cm is " + String.format("%.2f", areaCm2));

        input.close();
    }
}