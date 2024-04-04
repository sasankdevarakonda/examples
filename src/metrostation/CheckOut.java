package metrostation;

public class CheckOut {
    String fromAddress;
    Ticket ticket;

    @Override
    public String toString() {
        return "CheckOut{" +
                "fromAddress='" + fromAddress + '\'' +
                ", ticket=" + ticket +
                '}';
    }
}
