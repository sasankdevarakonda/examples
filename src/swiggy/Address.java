package swiggy;

public class Address {

    String name;
    long mobileNo;
    int pincode;
    String city;
    String email;

    public Address(String name, long mobileNo, int pincode, String city, String email) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.pincode = pincode;
        this.city = city;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", mobileNo=" + mobileNo +
                ", pincode=" + pincode +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
