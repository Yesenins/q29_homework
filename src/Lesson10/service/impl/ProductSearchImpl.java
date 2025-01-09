package Lesson10.service.impl;

import Lesson10.domain.Product;
import Lesson10.service.ProductSearch;

import java.util.ArrayList;
import java.util.List;

public class ProductSearchImpl implements ProductSearch {

    @Override
    public String searchByName(List<Product> list, String name) {
        for(Product el : list){
            if(el.getName().equalsIgnoreCase(name)){
               return  "[Name: " + el.getName()+ ", Cost: " + el.getCost()+", Amount: "+ el.getAmount()+ "]";
            }
        }
        return "No such item";
    }

    @Override
    public List<Product> searchByCost(List<Product> list, int cost) {
        System.out.println("Goods with a value higher than "+ cost + "$: ");
        List<Product> goods = new ArrayList<>();
        for(Product el : list){
            if(el.getCost() > cost){
                goods.add(el);
            }
        }
        return goods;
    }

    @Override
    public int getQuantityOfAllProducts(List<Product> list) {
        int counter = 0;
        for(Product el : list){
            counter+= el.getAmount();
        }
        return counter;
    }
}
