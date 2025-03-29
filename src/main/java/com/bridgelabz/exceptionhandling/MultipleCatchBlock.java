package com.bridgelabz.exceptionhandling;

import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] array = (size > 0) ? new int[size] : null;

            // Fill the array with sample values
            if (array != null) {
                System.out.println("Enter elements of array:");
                for (int i = 0; i < size; i++) {
                    array[i] = scanner.nextInt();
                }
            }

            // Accept index from user
            System.out.print("Enter the index to retrieve value: ");
            int index = scanner.nextInt();

            // Call the method to get value at index
            retrieveValue(array, index);

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } finally {
            scanner.close(); // Close scanner to prevent resource leak
        }
    }

    // Method to retrieve value at a given index with exception handling
    public static void retrieveValue(int[] array, int index) {
        try {
            if (array == null) {
                throw new NullPointerException("Array is not initialized!");
            }
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}

