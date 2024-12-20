package Lesson7;

import Lesson7.domain.Order;
import Lesson7.domain.Menu;
import Lesson7.service.ClientServiceControl;
import Lesson7.service.impl.*;

public class MainApp {
    public static void main(String[] args) {
        Order order = new Order("Serega",
                new Menu[]{Menu.CHEESEBURGER,Menu.FRIES, Menu.COCA_COLA},
                true);


        ClientServiceControl serviceControl = new ClientServiceControlImpl(
                new OnlineClientsOrderImpl(),
                new OrderDataServiceIml(),
                new ClientOrderStatusImpl(),
                new ClientOrderDeliveryImpl()
        );
        serviceControl.controlService(order);
    }
}
