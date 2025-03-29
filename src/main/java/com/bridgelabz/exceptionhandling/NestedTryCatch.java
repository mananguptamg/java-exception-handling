package com.bridgelabz.exceptionhandling;
import java.util.Scanner;
public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter the index: ");
        int index = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        try {
            // Try accessing the array index
            int value = numbers[index];

            try {
                // Try dividing the value by the divisor
                int result = value / divisor;
                System.out.println("Division result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}
