//Payment.java


package services;
import models.Order;
import exceptions.PaymentException;

public class Payment implements OrderProcessing {
    @Override
    public void processOrder(Order order) throws PaymentException {
        if (order.getTotalAmount() <= 0) {
            throw new PaymentException("Payment failed: Order total cannot be zero or negative.");
        }
        System.out.println("Payment of $" + order.getTotalAmount() + " processed successfully.");
    }
}
