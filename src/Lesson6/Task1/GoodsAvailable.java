package Lesson6.Task1;

public class GoodsAvailable {
    public int getQuantityAvailable(Product[] list, ProductType type){
        int quantity = 0;
        for(Product product : list){
            if(product.getType() == type){
                if(product.isAvailability()){
                    quantity++;
                }
            }

        }
        return quantity;
    }
}
