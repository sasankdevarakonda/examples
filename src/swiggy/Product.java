package swiggy;

public class Product {
    String productName;
    float prize;

    public Product(String productName, float prize) {
        this.productName = productName;
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", prize=" + prize +
                '}';
    }
}
