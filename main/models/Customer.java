package models;
import services.*;
import java.util.*;

public class Customer extends User {
    private List<Order> orders = new ArrayList<>();

    public Customer(String name, String email) {
        super(name, email, "Customer");
    }

    public void placeOrder(Order order) {
        orders.add(order);
        order.saveToDatabase(email);
        System.out.println(name + " placed an order: " + order.getOrderId());
    }

    public void displayUserInfo() {
        System.out.println("Customer: " + name + " (" + email + ")");
    }
}

