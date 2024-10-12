package org.example.notification;

import org.example.order.Order;

public class Email {
    public void updateOrderStatus(Order order) {
        System.out.println("E-mail - zamówienie numer: " + order.getOrderNumber() + " zamieniło status na: " + order.getOrderStatus());
    }
}
