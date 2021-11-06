package com.shamimsir.lab5.prob2;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(10000);

        account.credit(1000);

        System.out.println(account.getBalance());

        account.debit(2000);

        System.out.println(account.getBalance());

    }
}
