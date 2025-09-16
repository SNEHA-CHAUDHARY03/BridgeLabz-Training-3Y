import java.util.*;

public class PositiveNegativeEvenOdd {
    public static boolean isPositive(int n) { return n >= 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            if (isPositive(arr[i])) {
                System.out.println(arr[i] + " is positive and " + (isEven(arr[i]) ? "even" : "odd"));
            } else {
                System.out.println(arr[i] + " is negative");
            }
        }
        int cmp = compare(arr[0], arr[4]);
        if (cmp == 0) System.out.println("First and last elements are equal");
        else if (cmp > 0) System.out.println("First element is greater than last");
        else System.out.println("First element is less than last");
    }
}
