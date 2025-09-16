import java.util.Scanner;

public class CharArrayDemo {
    static char[] getChars(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] arr1 = getChars(text);
        char[] arr2 = text.toCharArray();

        boolean same = compareCharArrays(arr1, arr2);

        System.out.println("User-defined char array: " + new String(arr1));
        System.out.println("Built-in toCharArray: " + new String(arr2));
        System.out.println("Arrays are equal: " + same);
    }
}
