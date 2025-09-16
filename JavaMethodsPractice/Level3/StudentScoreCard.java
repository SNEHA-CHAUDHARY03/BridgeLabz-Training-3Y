import java.util.*;

public class StudentScoreCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of students: ");
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] results = calcResults(scores);
        display(scores, results);
    }
    static int[][] generateScores(int n) {
        int[][] s = new int[n][3];
        Random rand = new Random();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                s[i][j] = rand.nextInt(90) + 10;
        return s;
    }
    static double[][] calcResults(int[][] s) {
        double[][] r = new double[s.length][3];
        for (int i = 0; i < s.length; i++) {
            int total = s[i][0] + s[i][1] + s[i][2];
            double avg = Math.round((total/3.0)*100)/100.0;
            double perc = Math.round((total/3.0)*100/100.0);
            r[i][0] = total; r[i][1] = avg; r[i][2] = perc;
        }
        return r;
    }
    static void display(int[][] s, double[][] r) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPerc");
        for (int i = 0; i < s.length; i++)
            System.out.printf("%d\t%d\t%d\t%.0f\t%.2f\t%.2f\n", s[i][0], s[i][1], s[i][2], r[i][0], r[i][1], r[i][2]);
    }
}
