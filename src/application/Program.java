package application;

import entities.BusinnesAccount;

public class Program {
    public static void main(String[] args) {


        //Java Activity:
        //Suppose a bank business that has a regular account and a business account.
        //The business account includes all the features of the regular account, plus a loan limit and an operation to take out loans.

        BusinnesAccount account = new BusinnesAccount(8010, "Bob Brown", 0.0, 500.0);
        System.out.println(account.getBalance());
        System.out.println(account.getLoanLimit());

    }
}
