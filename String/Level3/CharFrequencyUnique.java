import java.util.Scanner;

public class CharFrequencyUnique {
    public static char[] uniqueChars(String s) {
        int n = s.length();
        char[] unique = new char[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < idx; j++) if (unique[j] == c) { found = true; break; }
            if (!found) unique[idx++] = c;
        }
        char[] result = new char[idx];
        for (int i = 0; i < idx; i++) result[i] = unique[i];
        return result;
    }

    public static String[][] freqOfUnique(String s) {
        int[] freq = new int[256];
        int n = s.length();
        for (int i = 0; i < n; i++) freq[s.charAt(i)]++;
        char[] unique = uniqueChars(s);
        String[][] res = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            res[i][0] = String.valueOf(unique[i]);
            res[i][1] = String.valueOf(freq[unique[i]]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        String[][] freq = freqOfUnique(s);
        System.out.println("Char\tFreq");
        for (String[] row : freq) System.out.println(row[0] + "\t" + row[1]);
    }
}
