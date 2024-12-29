package Lesson10.service.impl;

import Lesson10.domain.Product;
import Lesson10.service.ProductHandler;
import Lesson10.service.ProductSearch;

import java.util.List;

public class ProductHandlerImpl implements ProductHandler {

    private final ProductSearch productSearch;

    public ProductHandlerImpl(ProductSearch productSearch){
        this.productSearch = productSearch;
    }

    @Override
    public void runSearch(List<Product> list) {

        productSearch.searchByName(list, "samsung");

        productSearch.searchByCost(list,70);

        int quantityOfAllProducts = productSearch.getQuantityOfAllProducts(list);
        System.out.println("Quantity of all goods: " + quantityOfAllProducts);

        var poco = new Product("Poco", 40, 100);

        list.add(2,poco);

        int numberOfElements = list.size();
        System.out.println("Number of elements in the list: " + numberOfElements);

        boolean containsResult = list.contains(poco);
        System.out.println(containsResult);

        for(int i = 0; i < 2; i++){
            System.out.println("[Name: " + list.get(i).getName()+ ", Cost: " + list.get(i).getCost()+", Amount: "+list.get(i).getAmount()+ " ]");
        }

        List<Product> reverseProduct = list.reversed();

    }
}
