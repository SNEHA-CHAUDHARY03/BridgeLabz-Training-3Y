import java.util.*;

public class NumberChecker {
    public static void main(String[] args) {
        int number = 153;
        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count: " + digits.length);
        System.out.println("Duck: " + isDuck(digits));
        System.out.println("Armstrong: " + isArmstrong(number, digits));
        int[] largest = largestTwo(digits);
        int[] smallest = smallestTwo(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
        // ...add calls for other methods as needed...
    }
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }
    public static boolean isDuck(int[] digits) {
        for (int i = 1; i < digits.length; i++) if (digits[i] == 0) return true;
        return false;
    }
    public static boolean isArmstrong(int n, int[] digits) {
        int sum = 0, len = digits.length;
        for (int d : digits) sum += Math.pow(d, len);
        return sum == n;
    }
    public static int[] largestTwo(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max1) { max2 = max1; max1 = d; }
            else if (d > max2 && d != max1) max2 = d;
        }
        return new int[]{max1, max2};
    }
    public static int[] smallestTwo(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min1) { min2 = min1; min1 = d; }
            else if (d < min2 && d != min1) min2 = d;
        }
        return new int[]{min1, min2};
    }
    // ...add other static methods as per prompt...
}
