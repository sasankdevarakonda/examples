package swiggy;

public class Order {
    Address address;
    OrderItem orderItem;
    String orderId;
    double price;
    public Order(Address address, OrderItem orderItem,String orderId,double price) {
        this.address = address;
        this.orderItem = orderItem;
        this.orderId=orderId;
        this.price=price;

    }

    @Override
    public String toString() {
        return "Order{" +
                "address=" + address +
                ", orderItem=" + orderItem +
                ", orderId='" + orderId + '\'' +
                ", price=" + price +
                '}';
    }
}
