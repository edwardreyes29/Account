package com.company;

import java.util.Date;

public class Transaction {
    public final static char WITHDRAWAL = 'W';
    public final static char DEPOSIT = 'D';

    private Date date;  // Date of this transaction
    private char type;  // Type of transaction
    private double amount;  // Amount of transaction
    private double balance; // Balance after this transaction
    private String description; // Description of this transaction

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        if (type == WITHDRAWAL) {
            balance -= amount;  // Get new balance
        } else {
            balance += amount;
        }
        this.balance = balance;
        this.description = description;
        date = new Date();
    }

    public double getNewBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Transaction amount: $" + amount +
                "\nCurrent Balance: $" + balance +
                "\nDate: " + date +
                "\nDescription: " + description;
    }


}
