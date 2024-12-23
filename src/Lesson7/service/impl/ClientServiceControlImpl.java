package Lesson7.service.impl;

import Lesson7.domain.Order;
import Lesson7.service.*;

public class ClientServiceControlImpl implements ClientServiceControl {
    private ClientsOrder clientsOrder;
    private OrderDataService dataService;
    private ClientOrderStatus orderStatus;
    private ClientOrderDelivery orderDelivery;

    public ClientServiceControlImpl(ClientsOrder clientsOrder, OrderDataService dataService, ClientOrderStatus orderStatus, ClientOrderDelivery orderDelivery) {
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
