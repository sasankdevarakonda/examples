package SwiggyDemo;

public class Restuarant {
    public String restuarantName;
    public String food;
    Address address;

    @Override
    public String toString() {
        return "Restuarant{" +
                "restuarantName='" + restuarantName + '\'' +
                ", food='" + food + '\'' +
                ", address=" + address +
                '}';
    }
}
