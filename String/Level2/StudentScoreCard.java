import java.util.Random;

public class StudentScoreCard {
    public static int[][] randomScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = rand.nextInt(41) + 60;
        return scores;
    }

    public static double[][] totals(int[][] scores) {
        double[][] arr = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = Math.round((total / 3.0) * 100.0 / 100.0);
            arr[i][0] = total;
            arr[i][1] = Math.round(avg * 100.0) / 100.0;
            arr[i][2] = Math.round((total / 3.0) * 100.0 / 100.0);
        }
        return arr;
    }

    public static String[] grades(double[][] arr) {
        String[] grades = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            double perc = arr[i][2];
            if (perc >= 90) grades[i] = "A";
            else if (perc >= 80) grades[i] = "B";
            else if (perc >= 70) grades[i] = "C";
            else if (perc >= 60) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void display(int[][] scores, double[][] arr, String[] grades) {
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPerc\tGrade");
        for (int i = 0; i < scores.length; i++)
            System.out.println((i+1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" +
                (int)arr[i][0] + "\t" + arr[i][1] + "\t" + arr[i][2] + "\t" + grades[i]);
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] scores = randomScores(n);
        double[][] arr = totals(scores);
        String[] gradeArr = grades(arr);
        display(scores, arr, gradeArr);
    }
}
