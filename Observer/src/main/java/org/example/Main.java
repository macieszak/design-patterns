package org.example;

import org.example.notification.Email;
import org.example.notification.MobileApp;
import org.example.notification.TextMessage;
import org.example.order.Order;
import org.example.order.OrderStatus;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();
        System.out.println("\n---------------\n");
        order.changeOrderStatus(OrderStatus.WYSLANE);

        order.unregisterObserver(email);
        System.out.println("\n---------------\n");
        order.changeOrderStatus(OrderStatus.ODEBRANE);


    }
}