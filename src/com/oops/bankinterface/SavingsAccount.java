package com.oops.bankinterface;

public class SavingsAccount extends BankAccount implements TransactionLogger{

    private String accountName;

    public double getBalance() {
        return this.balance;
    }

    private double balance=0f;

    SavingsAccount(String accountName,double balance) {
        this.accountName=accountName;
        this.balance=balance;
    }

    @Override
    public void deposit(double amount) {
        this.balance+=amount;
        logTransaction();
    }

    @Override
    public double calculateInterest() {
        return this.balance*0.03;
    }

    @Override
    public void logTransaction(){
        System.out.println("Logged Transaction for Savings Account "+this.accountName);
    }


}
