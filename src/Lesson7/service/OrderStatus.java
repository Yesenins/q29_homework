package Lesson7.service;

import Lesson7.domain.Order;

public interface OrderStatus {
    void sendStatusReport(Order order);
}
