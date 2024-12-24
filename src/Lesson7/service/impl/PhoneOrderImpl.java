package Lesson7.service.impl;

import Lesson7.domain.Order;
import Lesson7.service.ClientsOrder;

public class PhoneOrderImpl implements ClientsOrder {
    @Override
    public void getOrder(Order order) {
        order.setPhoneNumber("+375256748374");
        System.out.println("payment check will be sent to your phone number "
                + order.getPhoneNumber() + " by SMS");
    }
}
