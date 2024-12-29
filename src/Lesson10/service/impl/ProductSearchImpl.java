package Lesson10.service.impl;

import Lesson10.domain.Product;
import Lesson10.service.ProductSearch;

import java.util.List;

public class ProductSearchImpl implements ProductSearch {

    @Override
    public void searchByName(List<Product> list, String name) {
        for(Product el : list){
            if(el.getName().equalsIgnoreCase(name)){
                System.out.println("[Name: " + el.getName()+ ", Cost: " + el.getCost()+", Amount: "+ el.getAmount()+ " ]");
            }
        }
        System.out.println();
    }

    @Override
    public void searchByCost(List<Product> list, int cost) {
        System.out.println("Goods with a value higher than "+ cost + "$: ");
        for(Product el : list){
            if(el.getCost() > cost){
                System.out.println("[Name: " + el.getName()+ ", Cost: " + el.getCost()+", Amount: "+ el.getAmount()+ " ]");
            }
        }
        System.out.println();
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
