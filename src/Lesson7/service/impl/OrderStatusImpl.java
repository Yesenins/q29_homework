package Lesson7.service.impl;

import Lesson7.domain.Order;
import Lesson7.service.OrderStatus;

import java.util.Arrays;

public class OrderStatusImpl implements OrderStatus {
    @Override
    public void sendStatusReport(Order order) {
        int number = (int)(Math.random() * 120) + 1;
        System.out.println("Your order number "+ number +": " + Arrays.toString(order.getMenu())+" it's being cooked.");
    }
}
