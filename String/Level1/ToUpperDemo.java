import java.util.Scanner;

public class ToUpperDemo {
    static String toUpperByCharAt(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                sb.append((char)(c - 32));
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

        String upper1 = toUpperByCharAt(text);
        String upper2 = text.toUpperCase();

        boolean same = compareByCharAt(upper1, upper2);

        System.out.println("Uppercase by charAt(): " + upper1);
        System.out.println("Uppercase by toUpperCase(): " + upper2);
        System.out.println("Are both uppercase strings equal: " + same);
    }
}
