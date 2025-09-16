public class Product {
    static double discount = 10.0; // percent
    final int productID;
    String productName;
    double price;
    int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayDetails() {
        System.out.println("Product: " + productName + ", ID: " + productID + ", Price: " + price + ", Quantity: " + quantity + ", Discount: " + discount + "%");
    }

    public static void main(String[] args) {
        Product p = new Product(1, "Laptop", 50000, 2);
        if (p instanceof Product) {
            p.displayDetails();
        }
        updateDiscount(15.0);
        p.displayDetails();
    }
}
