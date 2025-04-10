package com.mycompany.week_9;

public class w9p6 {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling severe exception
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NullPointerException e) {
            // Handling another severe exception
            System.out.println("Error: Null reference encountered.");
        } catch (Exception e) {
            // General exception handler (fallback)
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Code that always executes
            System.out.println("Execution completed.");
        }
    }

    public static int divide(int a, int b) {
        return a / b; // This will throw ArithmeticException if b is 0
    }
}
