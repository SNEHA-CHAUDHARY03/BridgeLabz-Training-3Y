import java.util.Scanner;

public class CharFrequency {
    public static String[][] charFrequency(String s) {
        int[] freq = new int[256];
        int n = s.length();
        for (int i = 0; i < n; i++) freq[s.charAt(i)]++;
        boolean[] done = new boolean[256];
        int count = 0;
        for (int i = 0; i < n; i++) if (!done[s.charAt(i)]) { done[s.charAt(i)] = true; count++; }
        String[][] res = new String[count][2];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (freq[c] > 0) {
                res[idx][0] = String.valueOf(c);
                res[idx][1] = String.valueOf(freq[c]);
                freq[c] = 0;
                idx++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        String[][] freq = charFrequency(s);
        System.out.println("Char\tFreq");
        for (String[] row : freq) System.out.println(row[0] + "\t" + row[1]);
    }
}
