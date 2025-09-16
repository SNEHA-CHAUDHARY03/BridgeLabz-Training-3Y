import java.util.Scanner;

// Class to find employee bonus based on years of service
class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take salary and years of service
        System.out.print("Enter employee salary (INR): ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int years = input.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is INR " + bonus);
        } else {
            System.out.println("No bonus. Years of service must be more than 5.");
        }

        input.close();
    }
}
