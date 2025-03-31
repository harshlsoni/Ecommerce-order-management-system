//Main.java

package main;
import models.*;
import services.*;
import database.DatabaseConnection;
import exceptions.PaymentException;
import java.sql.*;

public class EcommerceSystem {
    public static void main(String[] args) {
        try {
            // Creating users
            Admin admin = new Admin("Alice", "alice@shop.com");
            Customer customer = new Customer("Bob", "bob@email.com");

            admin.displayUserInfo();
            customer.displayUserInfo();

            // Creating products
            Product laptop = new Product("P1001", "Laptop", 800.0);
            Product phone = new Product("P1002", "Smartphone", 500.0);

            // Placing an order
            Order order1 = new Order("O2001");
            order1.addProduct(laptop);
            order1.addProduct(phone);

            customer.placeOrder(order1);
            order1.displayOrderDetails();

            // Processing payment
            Payment payment = new Payment();
            payment.processOrder(order1);

            // Database connection test
            Connection conn = DatabaseConnection.getConnection();
            System.out.println("Database connected successfully!");
            conn.close();
        } catch (PaymentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
    }
}
