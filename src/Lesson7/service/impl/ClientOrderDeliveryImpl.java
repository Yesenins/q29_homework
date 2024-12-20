package Lesson7.service.impl;

import Lesson7.domain.Order;
import Lesson7.service.ClientOrderDelivery;

public class ClientOrderDeliveryImpl implements ClientOrderDelivery {
    @Override
    public void takeOrder(Order order) {
        order.setDeliveryAddress("13 Nadezhdinskaya Street, apartment 4");
        System.out.println("Your order will be delivered to "+ order.getDeliveryAddress());
    }

}