package swiggy;

public class OrderTest {
    public static void main(String[] args) {
        Address address = new Address("Sasank",6302142514l,521230,"Hyd","sasank@gmail.com");
        Product product = new Product("Biryani",250);
        OrderItem orderItem = new OrderItem("2","500",product);
        Order order = new Order(address,orderItem,"I123",500.0);
        System.out.println(order);
    }
}
