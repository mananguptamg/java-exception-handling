package com.bridgelabz.exceptionhandling;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Emter the amount");
            double amount = scanner.nextDouble();

            System.out.println("Emter the rate");
            double rate = scanner.nextDouble();

            System.out.println("Emter the year");
            int years = scanner.nextInt();

            // Call method to calculate interest
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest:" + interest);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }

    // Method to calculate interest with exception handling
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException();
        }
        return (amount * rate * years) / 100; // Simple Interest Formula
    }
}

