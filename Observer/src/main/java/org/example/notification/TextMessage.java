package org.example.notification;

import org.example.order.Order;

public class TextMessage implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("SMS - zamówienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }

}
