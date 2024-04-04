package Bank;

public class Test {
    public static void main(String[] args) {
        Account account = new Account(12345,903789,20000,6302142514l,"Sasank","sasi123");
        Atm atm = new Atm(200000,3784682,"Kphb");
        AtmCard atmCard = new AtmCard(1234567,"12/06",789,account);
        Transaction transaction = new Transaction(atm,"A123",atmCard);
        System.out.println(transaction);
    }
}
