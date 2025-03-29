package com.bridgelabz.exceptionhandling;

import java.io.*;

public class CompileTimeException {
    public static void main(String[] args) {
        String fileName = "data.txt"; // File to read

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File Contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
