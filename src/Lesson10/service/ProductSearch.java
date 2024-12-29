package Lesson10.service;

import Lesson10.domain.Product;

import java.util.List;

public interface ProductSearch {

    void searchByName(List<Product> list, String name);

    void searchByCost(List<Product> list, int cost);

    int getQuantityOfAllProducts(List<Product> list);

}
