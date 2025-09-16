import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] factors = getFactors(n);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum: " + sum(factors));
        System.out.println("Sum of squares: " + sumOfSquares(factors));
        System.out.println("Product: " + product(factors));
    }

    static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] arr = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) arr[idx++] = i;
        return arr;
    }

    static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    static int sumOfSquares(int[] arr) {
        int s = 0;
        for (int x : arr) s += Math.pow(x, 2);
        return s;
    }

    static int product(int[] arr) {
        int p = 1;
        for (int x : arr) p *= x;
        return p;
    }
}
