package Lesson7.service;

import Lesson7.domain.Order;

public interface ClientOrderDelivery {
    void takeOrder(Order order);
    default void takeWindowOrder(Order order){
        System.out.println("You can pick up your order at the delivery window");
    }
}
