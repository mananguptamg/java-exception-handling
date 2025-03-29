package com.bridgelabz.exceptionhandling;

import java.io.*;

public class ResourceManagement {
    public static void main(String[] args) {
        String fileName = "src/main/java/com/bridgelabz/exceptionhandling/info.txt";

        // Using try-with-resources to automatically close BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String firstLine = reader.readLine(); // Read the first line

            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("File is empty!");
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
