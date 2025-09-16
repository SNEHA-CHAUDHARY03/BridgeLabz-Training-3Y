import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    static void generateException(String[] arr, int idx) {
        System.out.println(arr[idx]); // May throw exception
    }

    static void handleException(String[] arr, int idx) {
        try {
            System.out.println(arr[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.print("Enter index to access: ");
        int idx = sc.nextInt();
        // Uncomment to see the exception
        // generateException(arr, idx);
        handleException(arr, idx);
    }
}
