import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons:");
        int n = sc.nextInt();
        double[][] personData = new double[n][3]; // 0: weight, 1: height, 2: BMI
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
            personData[i][0] = sc.nextDouble();
            System.out.println("Enter height (m) for person " + (i + 1) + ":");
            personData[i][1] = sc.nextDouble();
            if (personData[i][0] < 0 || personData[i][1] < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            double bmi = personData[i][2];
            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ": Height=" + personData[i][1] + " Weight=" + personData[i][0] + " BMI=" + personData[i][2] + " Status=" + status[i]);
        }
    }
}
