import java.util.Scanner;

public class SubstringDemo {
    static String substringByCharAt(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    static boolean compareByCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String sub1 = substringByCharAt(text, start, end);
        String sub2 = "";
        if (start >= 0 && end <= text.length() && start < end) {
            sub2 = text.substring(start, end);
        }
        boolean same = compareByCharAt(sub1, sub2);

        System.out.println("Substring using charAt(): " + sub1);
        System.out.println("Substring using substring(): " + sub2);
        System.out.println("Are substrings equal: " + same);
    }
}
