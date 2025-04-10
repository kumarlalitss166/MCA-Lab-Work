package com.mycompany.week_9;

import java.util.logging.Level;
import java.util.logging.Logger;

public class w9p4 {
    private static final Logger LOGGER = Logger.getLogger(w9p4.class.getName());

    public static void main(String[] args) {
        try {
            // Example: Division by zero
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            LOGGER.log(Level.SEVERE, "An arithmetic exception occurred: " + e.getMessage(), e);
            System.out.println("Error: Cannot divide by zero. Please provide a valid denominator.");
        }
    }

    public static int divide(int a, int b) {
        return a / b; // This may throw ArithmeticException
    }
}

