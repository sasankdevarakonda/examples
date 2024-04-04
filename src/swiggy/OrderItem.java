package swiggy;

public class OrderItem {
    String foodQuantity;
    Product product;
    String orderPrize;



    public OrderItem(String foodQuantity, String orderPrize, Product product) {
        this.foodQuantity = foodQuantity;

        this.orderPrize = orderPrize;
        this.product=product;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "foodQuantity='" + foodQuantity + '\'' +
                ", product=" + product +
                ", orderPrize='" + orderPrize + '\'' +
                '}';
    }
}
