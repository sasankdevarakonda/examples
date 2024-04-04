package SwiggyDemo;

public class User {
    public String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                '}';
    }

    public String houseNo;
    public String phoneNumber;
    Address address;

}
