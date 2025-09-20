class Order {
    String orderId;
    String orderDate;
    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    String getOrderStatus() {
        return "Order placed";
    }
}
class ShippedOrder extends Order {
    String trackingNumber;
    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override
    String getOrderStatus() {
        return "Order shipped " + trackingNumber;
    }
}
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    String getOrderStatus() {
        return "Order delivered " + deliveryDate;
    }
}
class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order o = new Order("O1", "2025-09-20");
        ShippedOrder s = new ShippedOrder("O2", "2025-09-19", "TRK123");
        DeliveredOrder d = new DeliveredOrder("O3", "2025-09-18", "TRK456", "2025-09-20");
        System.out.println(o.getOrderStatus());
        System.out.println(s.getOrderStatus());
        System.out.println(d.getOrderStatus());
    }
}