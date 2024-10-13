package com.imd.bank;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new IllegalStateException("Insufficient balance");
        }
    }

    public void transfer(BankAccount destinationAccount, double amount) {
        if (destinationAccount == null) {
            throw new IllegalArgumentException("Destination account cannot be null");
        }
        this.withdraw(amount);
        destinationAccount.deposit(amount);

        // Bug: deposit amount twice instead of once.
        destinationAccount.deposit(amount);
    }
}
