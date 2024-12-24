package Lesson7.domain;

public class Order {
    private String name;
    private String phoneNumber;
    private String email;
    private String deliveryAddress;
    private Menu[] menu;

    public Order(String name,Menu[] menu){
        this.name = name;
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Menu[] getMenu() {
        return menu;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
