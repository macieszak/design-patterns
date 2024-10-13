package org.example.notification;

import org.example.order.Order;

public interface Observer {
    void update(Order order);
}
