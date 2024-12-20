package Lesson7.service;

import Lesson7.domain.Order;

public interface ClientOrderStatus {
    void sendStatusReport(Order order);
}
