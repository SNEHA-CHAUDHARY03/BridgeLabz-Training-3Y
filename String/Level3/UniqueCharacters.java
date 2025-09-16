import java.util.Scanner;

public class UniqueCharacters {
    public static int getLength(String s) {
        int len = 0;
        try {
            while (true) { s.charAt(len); len++; }
        } catch (Exception e) {}
        return len;
    }

    public static char[] uniqueChars(String s) {
        int n = getLength(s);
        char[] unique = new char[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < idx; j++) {
                if (unique[j] == c) { found = true; break; }
            }
            if (!found) unique[idx++] = c;
        }
        char[] result = new char[idx];
        for (int i = 0; i < idx; i++) result[i] = unique[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        char[] unique = uniqueChars(s);
        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");
        System.out.println();
    }
}
