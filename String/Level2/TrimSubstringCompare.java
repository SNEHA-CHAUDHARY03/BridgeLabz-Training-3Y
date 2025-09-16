import java.util.Scanner;

public class TrimSubstringCompare {
    public static int[] trimIndices(String str) {
        int len = 0;
        try { while (true) { str.charAt(len); len++; } } catch (Exception e) {}
        int start = 0, end = len - 1;
        while (start < len && str.charAt(start) == ' ') start++;
        while (end >= 0 && str.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    public static String customSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) sb.append(str.charAt(i));
        return sb.toString();
    }

    public static boolean customEquals(String a, String b) {
        int lenA = 0, lenB = 0;
        try { while (true) { a.charAt(lenA); lenA++; } } catch (Exception e) {}
        try { while (true) { b.charAt(lenB); lenB++; } } catch (Exception e) {}
        if (lenA != lenB) return false;
        for (int i = 0; i < lenA; i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string with spaces: ");
        String input = sc.nextLine();
        int[] idx = trimIndices(input);
        String trimmed = customSubstring(input, idx[0], idx[1]);
        String builtin = input.trim();
        System.out.println("Custom Trimmed: '" + trimmed + "'");
        System.out.println("Built-in Trimmed: '" + builtin + "'");
        System.out.println("Equal: " + customEquals(trimmed, builtin));
    }
}
