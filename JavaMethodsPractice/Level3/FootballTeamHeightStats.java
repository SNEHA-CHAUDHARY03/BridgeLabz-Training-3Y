import java.util.*;

public class FootballTeamHeightStats {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150 to 250
        }
        int sum = sum(heights);
        double mean = mean(heights);
        int min = min(heights);
        int max = max(heights);

        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Shortest: " + min + " cm");
        System.out.println("Tallest: " + max + " cm");
        System.out.println("Mean: " + mean + " cm");
    }
    static int sum(int[] arr) {
        int s = 0;
        for (int v : arr) s += v;
        return s;
    }
    static double mean(int[] arr) {
        return sum(arr) / (double) arr.length;
    }
    static int min(int[] arr) {
        int m = arr[0];
        for (int v : arr) if (v < m) m = v;
        return m;
    }
    static int max(int[] arr) {
        int m = arr[0];
        for (int v : arr) if (v > m) m = v;
        return m;
    }
}
