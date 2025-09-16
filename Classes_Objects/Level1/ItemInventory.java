class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double totalCost(int quantity) {
        return price * quantity;
    }
}

public class ItemInventory {
    public static void main(String[] args) {
        Item item = new Item(1001, "Pen", 10.5);
        item.displayDetails();
        int qty = 5;
        System.out.println("Total cost for " + qty + " items: " + item.totalCost(qty));
    }
}
