package ticketBooking;

import java.util.Date;

public class Ticket {
    String movieName;
    String rowNO;
    int seatNo;
    Date showTime;

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.movieName="Thillu";
        ticket.seatNo=2;
        ticket.rowNO="A";
        ticket.showTime=new Date();
        System.out.println(ticket);
    }


    @Override
    public String toString() {
        return "Ticket{" +
                "movieName='" + movieName + '\'' +
                ", rowNO='" + rowNO + '\'' +
                ", seatNo=" + seatNo +
                ", showTime=" + showTime +
                '}';
    }
}
