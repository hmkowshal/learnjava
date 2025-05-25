package com.oops.bankinterface;

public class BankAccountRunner {

    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount("Kowshal",1000.12);

        System.out.println(sa.getBalance());

        sa.deposit(245.54);

        sa.deposit(122.2);

        System.out.println(sa.getBalance());

        System.out.println("Interest for your deposite is : "+sa.calculateInterest());

    }
}
