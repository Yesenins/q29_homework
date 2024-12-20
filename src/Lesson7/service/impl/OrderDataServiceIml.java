package Lesson7.service.impl;

import Lesson7.domain.Order;
import Lesson7.service.OrderDataService;

public class OrderDataServiceIml implements OrderDataService {
    @Override
    public void save(Order order) {
//   Сделал бы базу данных как коллекцию и сохранил инфу в нее, но мы пока такое не умеем System.out.println("Save order to database");
    }
}
