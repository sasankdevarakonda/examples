package Bank;

public class AtmCard {
    int cardNo;
    String validity;
    int cvv;
    Account account;
    public AtmCard(int cardNo, String validity, int cvv, Account account) {
        this.cardNo = cardNo;
        this.validity = validity;
        this.cvv = cvv;
        this.account = account;
    }

    @Override
    public String toString() {
        return "AtmCard{" +
                "cardNo=" + cardNo +
                ", validity='" + validity + '\'' +
                ", cvv=" + cvv +
                ", account=" + account +
                '}';
    }
}
