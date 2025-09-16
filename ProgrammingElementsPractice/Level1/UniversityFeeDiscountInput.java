import java.util.Scanner;

// Class name indicates purpose: UniversityFeeDiscountInput
class UniversityFeeDiscountInput {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take fee input from user
        System.out.print("Enter the course fee (INR): ");
        double fee = input.nextDouble();

        // Take discount percent input from user
        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate discount amount
        double discount = (discountPercent / 100) * fee;

        // Calculate final fee after discount
        double finalFee = fee - discount;

        // Display result
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);

        input.close();
    }
}