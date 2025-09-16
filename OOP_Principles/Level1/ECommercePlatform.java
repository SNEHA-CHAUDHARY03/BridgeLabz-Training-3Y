abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }
    @Override
    public double calculateDiscount() { return getPrice() * 0.10; }
    @Override
    public double calculateTax() { return getPrice() * 0.18; }
    @Override
    public String getTaxDetails() { return "GST 18%"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }
    @Override
    public double calculateDiscount() { return getPrice() * 0.20; }
    @Override
    public double calculateTax() { return getPrice() * 0.05; }
    @Override
    public String getTaxDetails() { return "GST 5%"; }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }
    @Override
    public double calculateDiscount() { return getPrice() * 0.05; }
}

public class ECommercePlatform {
    public static void printFinalPrices(Product[] products) {
        for (Product p : products) {
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println(p.getName() + " Final Price: " + finalPrice);
        }
    }
    public static void main(String[] args) {
        Product[] products = {
            new Electronics(1, "Laptop", 50000),
            new Clothing(2, "Shirt", 2000),
            new Groceries(3, "Rice", 1000)
        };
        printFinalPrices(products);
    }
}
