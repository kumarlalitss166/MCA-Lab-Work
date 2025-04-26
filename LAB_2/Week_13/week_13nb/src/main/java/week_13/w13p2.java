package week_13;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

// Custom exception class
class FileMissingException extends Exception {
    public FileMissingException(String message) {
        super(message);
    }
}

public class w13p2 {
    public static void main(String[] args) {
        File file = new File("example.txt");

        try {
            // Check if file exists BEFORE trying to read it
            if (!file.exists()) {
                throw new FileMissingException("The file '" + file.getName() + "' was not found.");
            }

            // Try-with-resources
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                System.out.println("Reading file contents:\n");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (FileMissingException fme) {
            System.err.println("Custom Error - File missing: " + fme.getMessage());
        } catch (IOException ioe) {
            System.err.println("IOException while reading the file: " + ioe.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting to read the file.");
        }
    }
}
