// Class name indicates purpose: UniversityFeeDiscount
class UniversityFeeDiscount {

    public static void main(String[] args) {

        // University fee
        double fee = 125000;

        // Discount percentage
        double discountPercent = 10;

        // Calculate discount amount
        double discount = (discountPercent / 100) * fee;

        // Calculate final fee after discount
        double finalFee = fee - discount;

        // Display result
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
    }
}