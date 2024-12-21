package Lesson7.domain;

public class Order {
    private String name;
    private String phoneNumber;
    private String email;
    private String deliveryAddress;
    private Menu[] menu;
    private boolean selfDelivery;

    public Order(String name,Menu[] menu, boolean selfDelivery){
        this.name = name;
        this.menu = menu;
        this.selfDelivery = selfDelivery;
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

    public boolean isSelfDelivery() {
        return selfDelivery;
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
