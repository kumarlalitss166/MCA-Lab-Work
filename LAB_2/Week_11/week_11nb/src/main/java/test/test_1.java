package test;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class test_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date (dd-MM-yyyy): ");
        try{
        String dateString = scanner.nextLine();
        if(dateString.equals("")){
        dateString = null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dateString, formatter);
        System.out.println("Parsed date: " + date);    
        }
        catch (NullPointerException e){
            System.out.println("Date string is null.");
        }
        catch(DateTimeParseException e){
            System.out.println("Parsing failed: " + e.getMessage());
        }
        catch(IllegalArgumentException e){
            System.out.println("Incorrect formatter pattern: " + e.getMessage());
        }
    }
}
