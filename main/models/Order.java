//Order.java


package models;
import java.util.*;

public class Order {
    private String orderId;
    private List<Product> products = new ArrayList<>();
    private double totalAmount;

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
        totalAmount += product.getPrice();
    }

    public String getOrderId() { return orderId; }
    public double getTotalAmount() { return totalAmount; }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            System.out.println(" - " + p.getName() + " ($" + p.getPrice() + ")");
        }
        System.out.println("Total: $" + totalAmount);
    }
}
