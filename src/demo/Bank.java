package demo;

import javax.xml.namespace.QName;

public class Bank {

    static String name="chandhan";
    double availableBalance=34567.998;
    boolean login=true;
    long ph=6302142514l;


    public static void main(String[] args) {
        Bank bank= new Bank();
        System.out.println(bank.name);
        System.out.println(bank.login);

    }


}
