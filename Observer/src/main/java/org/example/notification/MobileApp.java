package org.example.notification;

import org.example.order.Order;

public class MobileApp {
    public void updateOrderStatus(Order order) {
        System.out.println("Aplikacja mobilna - zamówienie numer: " + order.getOrderNumber() + " zamieniło status na: " + order.getOrderStatus());
    }
}
