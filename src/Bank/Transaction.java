package Bank;

public class Transaction {

    Atm atm;
    String receiptNo;
    AtmCard card;

    public Transaction(Atm atm, String receiptNo, AtmCard card) {
        this.atm = atm;
        this.receiptNo = receiptNo;
        this.card = card;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "atm=" + atm +
                ", receiptNo='" + receiptNo + '\'' +
                ", card=" + card +
                '}';
    }
}
