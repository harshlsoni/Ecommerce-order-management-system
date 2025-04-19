//OrderProcessing.java

package services;
import models.Order;
import exceptions.PaymentException;

public interface OrderProcessing {
    void processOrder(Order order) throws PaymentException;
}
