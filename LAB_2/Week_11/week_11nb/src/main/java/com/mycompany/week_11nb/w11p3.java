package com.mycompany.week_11nb;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class w11p3{

    public static void main(String[] args) throws CustomParseException {
        try (Scanner scanner = new Scanner(System.in)) {
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
            System.out.println("Scanner closed successfully.");
        }
    }
    private static void handleCustomException(Throwable cause) {
        System.out.println("Cause: " + cause.getClass().getSimpleName() + " - " + cause.getMessage());
    }
}
