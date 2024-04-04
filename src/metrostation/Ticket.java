package metrostation;

public class Ticket {
    int price;
    int noOfPassengers;
    int platformNo;
    int time;

    @Override
    public String toString() {
        return "Ticket{" +
                "price=" + price +
                ", noOfPassengers=" + noOfPassengers +
                ", platformNo=" + platformNo +
                ", time=" + time +
                '}';
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        CheckIn checkIn1= new CheckIn();
        checkIn1.toAddress="Miyapur";
        checkIn1.ticket=ticket;
        CheckOut checkOut1=new CheckOut();
        checkOut1.fromAddress="LBNagar";
        checkOut1.ticket=ticket;
        ticket.noOfPassengers=2;
        ticket.time=10;
        ticket.platformNo=1;
        ticket.price=110;
       // System.out.println(C);
        System.out.println(checkIn1+" "+checkOut1);

    }
}