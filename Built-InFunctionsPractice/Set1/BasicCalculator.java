import java.util.Scanner;

public class BasicCalculator {
    static double add(double a, double b) { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }
    static double divide(double a, double b) { return b != 0 ? a / b : Double.NaN; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose operation: 1.Add 2.Subtract 3.Multiply 4.Divide");
        int op = sc.nextInt();
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        double result = 0;
        switch (op) {
            case 1: result = add(a, b); break;
            case 2: result = subtract(a, b); break;
            case 3: result = multiply(a, b); break;
            case 4: result = divide(a, b); break;
            default: System.out.println("Invalid operation."); return;
        }
        System.out.println("Result: " + result);
    }
}
