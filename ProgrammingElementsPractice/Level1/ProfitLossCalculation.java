// Class name indicates purpose: ProfitLossCalculation
class ProfitLossCalculation {

    public static void main(String[] args) {

        // Cost Price and Selling Price
        int costPrice = 129;
        int sellingPrice = 191;

        // Calculate Profit
        int profit = sellingPrice - costPrice;

        // Calculate Profit Percentage
        double profitPercent = (profit * 100.0) / costPrice;

        // Display result using single print statement with multiline output
        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent
        );
    }
}