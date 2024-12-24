package Lesson7;

import Lesson7.domain.Order;
import Lesson7.domain.Menu;
import Lesson7.service.ServiceControl;
import Lesson7.service.impl.*;

public class MainApp {
    public static void main(String[] args) {
        Order order = new Order("Serega",
                new Menu[]{Menu.CHEESEBURGER,Menu.FRIES, Menu.COCA_COLA});


        ServiceControl serviceControl = new ServiceControlImpl(
                new OnlineOrderImpl(),
                new OrderDataServiceIml(),
                new OrderStatusImpl(),
                new OrderDeliveryToClientHomeImpl()
        );
        serviceControl.controlService(order);
    }
}
