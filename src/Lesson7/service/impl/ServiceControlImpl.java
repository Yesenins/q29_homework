package Lesson7.service.impl;

import Lesson7.domain.Order;
import Lesson7.service.*;

public class ServiceControlImpl implements ServiceControl {
    private ClientsOrder clientsOrder;
    private OrderDataService dataService;
    private OrderStatus orderStatus;
    private OrderDelivery orderDelivery;

    public ServiceControlImpl(ClientsOrder clientsOrder, OrderDataService dataService, OrderStatus orderStatus, OrderDelivery orderDelivery) {
        this.clientsOrder = clientsOrder;
        this.dataService = dataService;
        this.orderStatus = orderStatus;
        this.orderDelivery = orderDelivery;
    }

    @Override
    public void controlService(Order order) {
        clientsOrder.getOrder(order);
        orderStatus.sendStatusReport(order);
        dataService.save(order);
        orderDelivery.takeOrder(order);

    }
}
