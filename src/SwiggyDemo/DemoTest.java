package SwiggyDemo;

public class DemoTest {
    public static void main(String []args){
     Address address = new Address("1-12","521230","Kphb 7Th phase","Ankur Hospital");
     Address address1 = new Address("1-13","521240","Jntu","metro");

        User user = new User();
        user.address=address;
        user.name="sasank";
        user.phoneNumber="6302142514";
        user.houseNo="1-11-123";
        System.out.println(user);

        Restuarant restuarant = new Restuarant();
        restuarant.restuarantName="Pistha House";
        restuarant.food="Haleem";
        restuarant.address=address1;
        System.out.println(restuarant);


    }


}
