package Lesson6.Task1;

public class CostOfGoods {
    public int getCostOfGoods(Product[] list, ProductType type){
        int sum = 0;
        for(Product product : list){
            if(product.getType() == type){
                sum += product.getCost();
            }
        }
        return sum;
    }
}
