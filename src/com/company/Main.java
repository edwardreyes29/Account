package com.company;

public class Main {

    public static void main(String[] args) {
        Account account = new Account("George", 1122, 1000.0, 0.015);
        System.out.println(account.getDateCreated());

        // Check new balance
        System.out.println("Current balance: $" + account.getBalance());

        // Deposit $30
        System.out.println();
        account.deposit(30, "Deposit $30");


        // Deposit $40 and deposit $50
        account.deposit(40, "Deposit $40");
        account.deposit(50, "Deposit $50");
        System.out.println();


        // Withdraw $5, $4, and $2
        account.withdraw(5, "Withdraw $5");
        account.withdraw(4, "Withdraw $4");
        account.withdraw(3, "Withdraw $3");


        // Print summary
        System.out.println(account.toString());
        // Show all transactions
        // Check transactions
        for (Transaction transaction : account.getTransactions()) {
            System.out.println(transaction.toString());
            System.out.println();
        }
    }
}
