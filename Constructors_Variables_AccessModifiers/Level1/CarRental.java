public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    static final double COST_PER_DAY = 1000.0;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * COST_PER_DAY;
    }
}
