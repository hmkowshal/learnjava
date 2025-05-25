package com.oops.bankinterface;

public abstract class BankAccount {
    private int accountNumber;
    private double balance;

    public abstract double calculateInterest();

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
