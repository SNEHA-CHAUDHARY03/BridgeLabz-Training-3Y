import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    static void generateException(String s) {
        System.out.println(s.charAt(s.length())); // Will throw exception
    }

    static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
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
