package Lesson10.domain;

public class Product {

    private String name;
    private Integer cost;
    private Integer amount;

    public Product(String name, Integer cost, Integer amount) {
        this.name = name;
        this.cost = cost;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    public Integer getAmount() {
        return amount;
    }
}
