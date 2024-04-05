package shopping;

import java.util.List;

public class Shop {
public List<Product>products;



    public Product findProduct(String type, String color, int size) {

        for (int i = 0; i < products.size(); i++) {
            Product product =products.get(i);
            if (product.type.equals(type) && product.productSpecification.color.equals(color) && product.productSpecification.size == size) {
                return product;
            }
        }
        return null;
    }
}
