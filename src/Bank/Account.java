package Bank;

public class Account {
    int accountNo;
    int ifcCode;
    double balance;
    long mobileNo;
    String userName;
    String password;
    public Account(int accountNo, int ifcCode, double balance, long mobileNo, String userName, String password) {
        this.accountNo = accountNo;
        this.ifcCode = ifcCode;
        this.balance = balance;
        this.mobileNo = mobileNo;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", ifcCode=" + ifcCode +
                ", balance=" + balance +
                ", mobileNo=" + mobileNo +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
