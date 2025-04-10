package com.mycompany.week_9;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class w9p1 {
    private static final Logger logger =  Logger.getLogger(w9p1.class.getName());
    
    public static void main(String[] args){
        try{
            // Simulating FIle Read (May throw FileNotFoundException)
            File file = new File("data.txt");
            Scanner scanner = new Scanner(file);
            
            // Reading a value from file
            String data = scanner.nextLine();
            scanner.close();
            
            // Simulation Number Parsing (May throw NumberFormatException)
            int number = Integer.parseInt(data);
            System.out.println("Parsed number: " + number);
            
            // Simulating Array Access (May throw ArrayIndexOutOfBoundsException)
            int[] arr = {1, 2, 3};
            System.out.println("Accessing invalid index: " + arr[5]);
        }
        catch(FileNotFoundException e){
            logger.log(Level.WARNING, "File not found! Ensure 'data.txt' exists.", e);  
        }
        catch(NumberFormatException e){
            logger.log(Level.SEVERE, "Invalid number format in the file", e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            logger.log(Level.SEVERE, "Invalid array index accessed!", e);
        }
        finally{
            System.out.println("Execution completed. Resources cleaned up.");
        }
    }
}