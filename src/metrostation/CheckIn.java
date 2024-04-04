package metrostation;

public class CheckIn {
    String toAddress;
    Ticket ticket;

    @Override
    public String toString() {
        return "CheckIn{" +
                "toAddress='" + toAddress + '\'' +
                ", ticket=" + ticket +
                '}';
    }
}
