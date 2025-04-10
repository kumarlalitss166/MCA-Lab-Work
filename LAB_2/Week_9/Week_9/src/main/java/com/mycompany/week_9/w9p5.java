package com.mycompany.week_9;

import java.util.Scanner;

public class w9p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Simulating Division by Zero Exception
            System.out.print("Enter a number to divide: ");
            int num = scanner.nextInt();
            int result = num / 0;  // This will throw ArithmeticException
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        try {
            // Simulating ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing invalid index: " + numbers[5]); // This will throw ArrayIndexOutOfBoundsException
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        }

        try {
            // Simulating NullPointerException
            String text = null;
            System.out.println("Length of text: " + text.length()); // This will throw NullPointerException
            
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access a null object.");
        }

        scanner.close();
        System.out.println("Program execution completed with error handling.");
    }
}

