import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ":");
            ages[i] = sc.nextInt();
            System.out.println("Enter height of " + names[i] + ":");
            heights[i] = sc.nextDouble();
        }

        int youngestIdx = 0, tallestIdx = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIdx]) youngestIdx = i;
            if (heights[i] > heights[tallestIdx]) tallestIdx = i;
        }

        System.out.println("Youngest: " + names[youngestIdx]);
        System.out.println("Tallest: " + names[tallestIdx]);
    }
}
