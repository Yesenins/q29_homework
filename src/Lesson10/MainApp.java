package Lesson10;

import Lesson10.domain.Product;
import Lesson10.service.impl.ProductHandlerImpl;
import Lesson10.service.impl.ProductSearchImpl;

import java.util.ArrayList;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Samsung", 100, 20));
        list.add(new Product("Lenovo", 40, 60));
        list.add(new Product("Huawei", 80, 100));
        list.add(new Product("Xiaomi", 60, 90));

        ProductHandlerImpl productHandlerImpl = new ProductHandlerImpl(new ProductSearchImpl());

        productHandlerImpl.runSearch(list);




    }
}
