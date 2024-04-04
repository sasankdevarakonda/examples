package Bank;

public class Atm {

    int balance;
    int mission_id;
    String location;

    public Atm(int balance, int mission_id, String location) {
        this.balance = balance;
        this.mission_id = mission_id;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Atm{" +
                "balance=" + balance +
                ", mission_id=" + mission_id +
                ", location='" + location + '\'' +
                '}';
    }
}
