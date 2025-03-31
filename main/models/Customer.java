//Customer.java 
package models;
import java.util.*;

public class Customer extends User {
    private List<Order> orders = new ArrayList<>();

    public Customer(String name, String email) {
        super(name, email);
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed an order: " + order.getOrderId());
    }

    public void displayUserInfo() {
        System.out.println("Customer: " + name + " (" + email + ")");
    }
}
