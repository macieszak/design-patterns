package org.example.notification;

import org.example.order.Order;

public class Email implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("E-mail - zamówienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }

}
