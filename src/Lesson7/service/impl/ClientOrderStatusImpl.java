package Lesson7.service.impl;

import Lesson7.domain.Order;
import Lesson7.service.ClientOrderStatus;

public class ClientOrderStatusImpl implements ClientOrderStatus {
    @Override
    public void sendStatusReport(Order order) {
        System.out.println("Thanks for your order, it's being cooked.");
    }
}
