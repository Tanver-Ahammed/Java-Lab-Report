package com.shamimsir.lab5.prob2;

public class Account {
    double balance;

    public Account(double balance) {
        this.balance = balance;
        if (this.balance < 0.0)
            this.balance = 1;
    }

    public void credit(double amount) {
        this.balance = this.balance + amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public void debit(double amount) {
        if (this.balance < amount)
            System.out.println("Debit amount exceeded account balance");
        else {
            this.balance = this.balance - amount;
            System.out.println("withdraws successfully");
        }
    }
}
