import java.util.Scanner;

public class PalindromeChecker {
    static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }

    static void displayResult(boolean result) {
        System.out.println(result ? "Palindrome" : "Not a palindrome");
    }

    public static void main(String[] args) {
        String s = getInput();
        displayResult(isPalindrome(s));
    }
}
