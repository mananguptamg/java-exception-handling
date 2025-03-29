package com.bridgelabz.exceptionhandling;

public class ExceptionPropagation {
    public static void main(String[] args) {
        try {
            method2(); // Calling method2(), which will eventually call method1()
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }

    // Method 2: Calls method1(), allowing the exception to propagate
    public static void method2() {
        method1();
    }

    // Method 1: Throws an ArithmeticException (division by zero)
    public static void method1() {
        int result = 10 / 0; // This will cause ArithmeticException
    }
}
