import java.util.Scanner;

public class MaxOfThree {
    static int getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        int a = getInput("Enter first number: ");
        int b = getInput("Enter second number: ");
        int c = getInput("Enter third number: ");
        System.out.println("Maximum is: " + max(a, b, c));
    }
}
