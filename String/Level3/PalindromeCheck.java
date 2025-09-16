import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome1(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }

    public static boolean isPalindrome2(String s, int l, int r) {
        if (l >= r) return true;
        if (s.charAt(l) != s.charAt(r)) return false;
        return isPalindrome2(s, l+1, r-1);
    }

    public static boolean isPalindrome3(String s) {
        char[] arr = s.toCharArray();
        char[] rev = reverse(s);
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != rev[i]) return false;
        return true;
    }

    public static char[] reverse(String s) {
        int n = s.length();
        char[] rev = new char[n];
        for (int i = 0; i < n; i++) rev[i] = s.charAt(n-1-i);
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        System.out.println("Logic 1: " + (isPalindrome1(s) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2: " + (isPalindrome2(s, 0, s.length()-1) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3: " + (isPalindrome3(s) ? "Palindrome" : "Not Palindrome"));
    }
}
