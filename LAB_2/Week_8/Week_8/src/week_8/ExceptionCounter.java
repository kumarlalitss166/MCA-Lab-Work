package week_8;
import java.io.*;

public class ExceptionCounter {
    
    public static int countExceptions(String filePath) {
        int exceptionCount = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.contains("Exception")) {
                    exceptionCount++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
        return exceptionCount;
    }
    
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the file path: ");
        
        try {
            String filePath = reader.readLine();
            int count = countExceptions(filePath);
            System.out.println("Total exceptions found: " + count);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}

