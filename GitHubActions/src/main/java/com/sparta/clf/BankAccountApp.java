package com.sparta.clf;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000);
        myAccount.deposit(500);
        myAccount.withdraw(200);
        System.out.println("Current balance: " + myAccount.getBalance());
        System.out.println("I deposited 500 pounds");
        // this is a comment
    }
}
