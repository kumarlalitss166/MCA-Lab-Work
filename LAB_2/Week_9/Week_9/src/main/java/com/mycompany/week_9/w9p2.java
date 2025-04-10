package com.mycompany.week_9;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class w9p2 {
    private static final Logger LOGGER = Logger.getLogger(w9p2.class.getName());
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
        try{
            //Handling InputMismatchException
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            
            //Handling ArithmeticException
            int result = 100 / num;
            System.out.println("100 / " + num + " = " + result);
            
            //Hanling ArrayIndexOutofBoundsException
            int[] numbers = {10, 20, 30};
            System.out.println("Accessing element at index 5: " + numbers[5]);
            
            //Handling NullPointerException
            String str = null;
            System.out.println("String length: " + str.length());
        }
        catch(InputMismatchException e){
            LOGGER.log(Level.WARNING, "Invalid input! Expected an integer.",e);
            System.out.println("Error: Please enter a valid integer.");
        }
        catch(ArithmeticException e){
            LOGGER.log(Level.SEVERE, "Division by zero detected!", e);
            System.out.println("Error: Cannot divide by zero.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            LOGGER.log(Level.SEVERE, "Array index out of bounds!", e);
            System.out.println("Error: Invalid array index.");
        }
        catch(NullPointerException e){
            LOGGER.log(Level.SEVERE, "Null point exception occured!", e);
            System.out.println("Error: Null reference detected.");
        }
        catch(Exception e){
            //Catching any other unexpected exceptions
            LOGGER.log(Level.SEVERE, "An unexpected error occured!", e);
            System.out.println("An unknown error occured. Please try again.");
        }
        finally{
            System.out.println("Program execution completed. Cleaning up resources...");
            scanner.close();
        }
    }        
}