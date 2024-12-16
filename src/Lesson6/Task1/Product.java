package Lesson6.Task1;

public class Product {
    private int cost;
    private String name;
    private boolean availability;
    private ProductType type;

    public Product(String name, int cost, ProductType type, boolean availability){
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.availability = availability;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(ProductType type){
        this.type = type;
    }

    public ProductType getType() {
        return type;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
