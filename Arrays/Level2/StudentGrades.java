import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + " (Physics, Chemistry, Maths):");
            physics[i] = sc.nextInt();
            chemistry[i] = sc.nextInt();
            maths[i] = sc.nextInt();
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            percent[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 80) grade[i] = 'B';
            else if (percent[i] >= 70) grade[i] = 'C';
            else if (percent[i] >= 60) grade[i] = 'D';
            else grade[i] = 'F';
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Physics=" + physics[i] + " Chemistry=" + chemistry[i] + " Maths=" + maths[i] + " Percentage=" + percent[i] + " Grade=" + grade[i]);
        }
    }
}
