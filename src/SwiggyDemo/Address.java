package SwiggyDemo;

public class Address {

    public String houseNo;

    @Override
    public String toString() {
        return "Address{" +
                "houseNo='" + houseNo + '\'' +
                ", pincode='" + pincode + '\'' +
                ", area='" + area + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public String pincode;
    public String area;
    public String street;

    public Address(String houseNo, String pincode, String area, String street) {
        this.houseNo = houseNo;
        this.pincode = pincode;
        this.area = area;
        this.street = street;
    }
}
