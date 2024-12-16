package Lesson6.Task1;

public class MainApp {
    public static void main(String[] args) {

        Product[] product = {
                new Product("LG", 3000, ProductType.TV, true),
                new Product("Sony", 2000, ProductType.TV, false),
                new Product("Xiaomi", 1000, ProductType.TV, true),
                new Product("Sony", 900, ProductType.AUDIO, false),
                new Product("Jbl", 400, ProductType.AUDIO, true),
                new Product("HyperX", 600, ProductType.AUDIO, true),
                new Product("Honor", 300, ProductType.MOBILE, true),
                new Product("Samsung", 800, ProductType.MOBILE, false ),
                new Product("Poco", 700, ProductType.MOBILE, true),
        };

        CostOfGoods costs = new CostOfGoods();
        System.out.println("The cost of all items of the TV type is: " + costs.getCostOfGoods(product,ProductType.TV));
        System.out.println("The cost of all items of the AUDIO type is: " + costs.getCostOfGoods(product,ProductType.AUDIO));
        System.out.println("The cost of all items of the MOBILE type is: " + costs.getCostOfGoods(product,ProductType.MOBILE));

        GoodsAvailable goodsAvailable = new GoodsAvailable();
        System.out.println("number of TV type products in stock: " + goodsAvailable.getQuantityAvailable(product, ProductType.TV));
        System.out.println("number of AUDIO type products in stock: " + goodsAvailable.getQuantityAvailable(product, ProductType.AUDIO));
        System.out.println("number of MOBILE type products in stock: " + goodsAvailable.getQuantityAvailable(product, ProductType.MOBILE));


    }
}
