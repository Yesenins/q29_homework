package Lesson7.service.impl;

import Lesson7.domain.Order;
import Lesson7.service.ClientsOrder;

public class OnlineOrderImpl implements ClientsOrder {
    @Override
    public void getOrder(Order order) {
        order.setEmail("serega@gmail.com");
        order.setPhoneNumber("+375256748374");
        System.out.println("Payment check will be sent to the email: " + order.getEmail());
    }
}
