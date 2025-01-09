package Lesson10.service;

import Lesson10.domain.Product;

import java.util.List;

public interface ProductSearch {

    String searchByName(List<Product> list, String name);

    List<Product> searchByCost(List<Product> list, int cost);

    int getQuantityOfAllProducts(List<Product> list);

}
