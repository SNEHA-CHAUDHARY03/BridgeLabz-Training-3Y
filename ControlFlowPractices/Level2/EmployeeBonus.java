import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Salary (INR): ");
        double salary = input.nextDouble();

        System.out.print("Enter Years of Service: ");
        int years = input.nextInt();

        double bonus = 0;

        if (years > 5) {
            bonus = 0.05 * salary;
        }

        System.out.println("Employee Salary: INR " + salary);
        System.out.println("Years of Service: " + years);
        System.out.println("Bonus Amount: INR " + bonus);

        input.close();
    }
}