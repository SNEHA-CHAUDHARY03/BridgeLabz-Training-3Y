import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        int[][] emp = new int[10][2];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            emp[i][0] = rand.nextInt(90000) + 10000; // salary 10000-99999
            emp[i][1] = rand.nextInt(11) + 1; // years 1-11
        }
        double[][] result = calcBonus(emp);
        display(emp, result);
    }
    static double[][] calcBonus(int[][] emp) {
        double[][] res = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double bonus = emp[i][1] > 5 ? emp[i][0]*0.05 : emp[i][0]*0.02;
            res[i][0] = emp[i][0] + bonus;
            res[i][1] = bonus;
        }
        return res;
    }
    static void display(int[][] emp, double[][] res) {
        double sumOld=0, sumNew=0, sumBonus=0;
        System.out.println("Salary\tYears\tNewSalary\tBonus");
        for (int i = 0; i < 10; i++) {
            sumOld += emp[i][0];
            sumNew += res[i][0];
            sumBonus += res[i][1];
            System.out.printf("%d\t%d\t%.2f\t%.2f\n", emp[i][0], emp[i][1], res[i][0], res[i][1]);
        }
        System.out.printf("Total\t\t%.2f\t%.2f\n", sumNew, sumBonus);
    }
}
