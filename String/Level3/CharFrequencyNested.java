import java.util.Scanner;

public class CharFrequencyNested {
    public static String[] freqNested(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int[] freq = new int[n];
        for (int i = 0; i < n; i++) {
            freq[i] = 1;
            if (arr[i] == '0') continue;
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    arr[j] = '0';
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) if (arr[i] != '0') count++;
        String[] res = new String[count];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != '0') {
                res[idx++] = arr[i] + " : " + freq[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        String[] freq = freqNested(s);
        for (String f : freq) System.out.println(f);
    }
}
