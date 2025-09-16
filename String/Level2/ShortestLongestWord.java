import java.util.Scanner;

public class ShortestLongestWord {
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

    public static int[] shortestLongest(String[][] arr) {
        int minIdx = 0, maxIdx = 0;
        int min = Integer.parseInt(arr[0][1]), max = min;
        for (int i = 1; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);
            if (len < min) { min = len; minIdx = i; }
            if (len > max) { max = len; maxIdx = i; }
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        String[] words = customSplit(input);
        String[][] arr = wordsWithLengths(words);
        int[] idxs = shortestLongest(arr);
        System.out.println("Shortest: " + arr[idxs[0]][0]);
        System.out.println("Longest: " + arr[idxs[1]][0]);
    }
}
