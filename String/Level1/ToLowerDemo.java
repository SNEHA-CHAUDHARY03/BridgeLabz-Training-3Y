import java.util.Scanner;

public class ToLowerDemo {
    static String toLowerByCharAt(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sb.append((char)(c + 32));
            } else {
                sb.append(c);
            }
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
        String text = sc.nextLine();

        String lower1 = toLowerByCharAt(text);
        String lower2 = text.toLowerCase();

        boolean same = compareByCharAt(lower1, lower2);

        System.out.println("Lowercase by charAt(): " + lower1);
        System.out.println("Lowercase by toLowerCase(): " + lower2);
        System.out.println("Are both lowercase strings equal: " + same);
    }
}
