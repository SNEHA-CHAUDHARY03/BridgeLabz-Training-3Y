import java.util.Scanner;

public class SplitStringWithoutSplit {
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static String[] customSplit(String str) {
        int len = getStringLength(str);
        int wordCount = 1;
        for (int i = 0; i < len; i++)
            if (str.charAt(i) == ' ') wordCount++;
        int[] spaceIdx = new int[wordCount + 1];
        int idx = 0;
        spaceIdx[idx++] = -1;
        for (int i = 0; i < len; i++)
            if (str.charAt(i) == ' ') spaceIdx[idx++] = i;
        spaceIdx[idx] = len;
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++)
            words[i] = str.substring(spaceIdx[i] + 1, spaceIdx[i + 1]);
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        String[] custom = customSplit(input);
        String[] builtin = input.split(" ");
        System.out.println("Custom Split:");
        for (String w : custom) System.out.println(w);
        System.out.println("Built-in Split:");
        for (String w : builtin) System.out.println(w);
        System.out.println("Arrays equal: " + compareArrays(custom, builtin));
    }
}
