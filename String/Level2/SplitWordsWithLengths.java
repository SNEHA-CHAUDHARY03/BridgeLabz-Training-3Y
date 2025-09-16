import java.util.Scanner;

public class SplitWordsWithLengths {
    public static int getStringLength(String str) {
        int count = 0;
        try { while (true) { str.charAt(count); count++; } }
        catch (Exception e) {}
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

    public static String[][] wordsWithLengths(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        String[] words = customSplit(input);
        String[][] result = wordsWithLengths(words);
        System.out.println("Word\tLength");
        for (String[] row : result)
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }
}
