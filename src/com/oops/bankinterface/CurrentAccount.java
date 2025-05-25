package com.oops.bankinterface;

public class CurrentAccount extends BankAccount implements TransactionLogger{

    private String accountName;

    private double balance=0f;

    public double getBalance() {
        return balance;
    }

    CurrentAccount(String accountName, double balance) {
        this.accountName=accountName;
        this.balance=balance;
    }

    @Override
    public double calculateInterest() {
        return this.balance*0.03;
    }

    @Override
    public void deposit(double amount) {
        this.balance+=amount;
        logTransaction();
    }

    @Override
    public void logTransaction(){
        System.out.println("Logged Transaction for Current Account "+this.accountName);
    }


}
