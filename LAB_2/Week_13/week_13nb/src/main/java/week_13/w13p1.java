package week_13;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class w13p1 {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Reading file contents:\n");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("FileNotFoundException: " + fnfe.getMessage());
        } catch (IOException ioe) {
            System.err.println("IOException while reading the file: " + ioe.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }
}
