import java.util.Random;

public class StudentVotingEligibility {
    public static int[] randomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++)
            ages[i] = rand.nextInt(90) + 10;
        return ages;
    }

    public static String[][] canVoteTable(int[] ages) {
        String[][] arr = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            arr[i][0] = String.valueOf(ages[i]);
            arr[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return arr;
    }

    public static void displayTable(String[][] arr) {
        System.out.println("Age\tCanVote");
        for (String[] row : arr)
            System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        int[] ages = randomAges(10);
        String[][] table = canVoteTable(ages);
        displayTable(table);
    }
}
