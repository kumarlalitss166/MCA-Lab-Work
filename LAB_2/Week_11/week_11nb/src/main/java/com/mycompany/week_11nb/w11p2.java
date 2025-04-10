package com.mycompany.week_11nb;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

//Custom Exception Class
class CustomParseException extends Exception{
    public CustomParseException(String message, Throwable cause){
        super(message, cause);
    }
}
public class w11p2 {

    public static void main(String[] args) throws CustomParseException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a date (dd-MM-yyyy): ");
            String dateString = scanner.nextLine();

            if (dateString.equals("")) {
                dateString = null;
            }

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date = LocalDate.parse(dateString, formatter);
            System.out.println("Parsed date: " + date);
        } catch (NullPointerException e) {
            handleCustomException(new CustomParseException("Date string is null.", e));
        } catch (DateTimeParseException e) {
            handleCustomException(new CustomParseException("Date format or value is incorrect.", e));
        } catch (IllegalArgumentException e) {
            handleCustomException(new CustomParseException("Invalid formatter pattern.", e));
        } finally {
            scanner.close();
            System.out.println("Scanner closed successfully.");
        }
    }
    private static void handleCustomException(Throwable cause) {
        System.out.println("Cause: " + cause.getClass().getSimpleName() + " - " + cause.getMessage());
    }
}
