package shopping;

import java.util.ArrayList;
import java.util.List;

public class ShopDemoTest {
    public static void main(String[] args) {
        // Create products
        Product shirtProduct = new Product();
        ProductSpecification shirtSpec = new ProductSpecification();
        shirtSpec.color = "Blue";
        shirtSpec.price = 1000;
        shirtSpec.size = 40;
        shirtProduct.type = "Shirt";
        shirtProduct.productSpecification = shirtSpec;

        // Create shop
        Shop shop = new Shop();
        List<Product> products = new ArrayList<>();
        products.add(shirtProduct);
        shop.products = products;


        // Find product
        Product foundProduct = shop.findProduct("Shirt","Blue",40);
        if (foundProduct != null) {
            System.out.println("Matching product found: " + foundProduct.type + " (Color: " + foundProduct.productSpecification.color + ") "+ " Size : "+foundProduct.productSpecification.size);
        } else {
            System.out.println("No matching product found.");
        }
    }
}