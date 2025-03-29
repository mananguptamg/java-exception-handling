package com.bridgelabz.exceptionhandling;

import java.util.Scanner;

// Custom Exception for Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}
    public class BankAccountSystem{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            BankAccount account = new BankAccount(1000); // Initial balance: 1000

            try {
                System.out.println("Account opened with inital balance 1000");
                System.out.print("Please enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
