package Lesson7.service.impl;

import Lesson7.domain.Order;
import Lesson7.service.OrderDelivery;

public class OrderDeliveryToClientHomeImpl implements OrderDelivery {
    @Override
    public void takeOrder(Order order) {
        order.setDeliveryAddress("13 Nadezhdinskaya Street, apartment 4");
        System.out.println("Your order will be delivered to "
                + order.getDeliveryAddress() + ", within 50 minutes");
    }
}
