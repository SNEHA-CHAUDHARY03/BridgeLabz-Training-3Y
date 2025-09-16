import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Error: Not a natural number.");
            return;
        }
        int size = number / 2 + 1;
        int[] evens = new int[size];
        int[] odds = new int[size];
        int evenIdx = 0, oddIdx = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evens[evenIdx++] = i;
            } else {
                odds[oddIdx++] = i;
            }
        }
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIdx; i++) System.out.print(evens[i] + " ");
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oddIdx; i++) System.out.print(odds[i] + " ");
        System.out.println();
        sc.close();
    }
}
