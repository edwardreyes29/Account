package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;


    public Account() {
        this(0,0,0);
    }
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }
    public Account(String name, int id, double balance, double annualInterestRate) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }


    public double getMonthlyInterest() {
        return (balance * annualInterestRate) / 12;
    }

    public void withdraw(double amount, String description) {
        transactions.add(new Transaction(Transaction.WITHDRAWAL, amount, balance, description));
        balance = transactions.get(transactions.size() - 1).getNewBalance();
    }
    public void deposit(double amount, String description) {
        transactions.add(new Transaction(Transaction.DEPOSIT, amount, balance, description));
        balance = transactions.get(transactions.size() - 1).getNewBalance();
    }

    @Override
    public String toString() {
        return "Account Holder: " + name +
                "\nAnnual Interest Rate: " + annualInterestRate * 100 + "%" +
                "\nBalance: $: " + balance;
    }
}
