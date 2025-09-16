abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Qty: " + quantity);
    }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }
    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }
    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.05; }
    @Override
    public String getDiscountDetails() { return "5% Veg Discount"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }
    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity() + 20; }
    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.02; }
    @Override
    public String getDiscountDetails() { return "2% Non-Veg Discount"; }
}

public class OnlineFoodDeliverySystem {
    public static void processOrder(FoodItem[] items) {
        for (FoodItem item : items) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();
            double discount = (item instanceof Discountable) ? ((Discountable)item).applyDiscount() : 0;
            System.out.println("Total after discount: " + (total - discount));
        }
    }
    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer", 150, 2),
            new NonVegItem("Chicken", 200, 1)
        };
        processOrder(order);
    }
}
