import java.util.Scanner;

public class NumberFormatDemo {
    static void generateException(String s) {
        int num = Integer.parseInt(s); // May throw exception
        System.out.println("Parsed number: " + num);
    }

    static void handleException(String s) {
        try {
            int num = Integer.parseInt(s);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        // Uncomment to see the exception
        // generateException(text);
        handleException(text);
    }
}
