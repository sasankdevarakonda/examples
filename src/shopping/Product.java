package shopping;

public class Product {
    public String type;
    String price;
    String brand;
    String color;
    public ProductSpecification productSpecification;

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", brand='" + brand + '\'' +
                ", productSpecification=" + productSpecification +
                '}';
    }
}
