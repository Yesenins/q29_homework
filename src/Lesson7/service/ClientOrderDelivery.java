package Lesson7.service;

import Lesson7.domain.Order;

public interface ClientOrderDelivery {

    default void takeOrder(Order order){
       System.out.println("You can pick up your order at the delivery window");
    }
}
