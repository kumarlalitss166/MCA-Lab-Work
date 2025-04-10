import java.io.*;
import java.util.regex.*;

public class ExceptionCounter {
    public static int countExceptions(String filePath) {
        int exceptionCount = 0;
        String exceptionPattern = "\b(try|catch|throw|throws)\b";
        Pattern pattern = Pattern.compile(exceptionPattern);
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    exceptionCount++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file.");
        }
        
        return exceptionCount;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ExceptionCounter <file_path>");
            return;
        }
        
        String filePath = args[0];
        int totalExceptions = countExceptions(filePath);
        System.out.println("Total number of exceptions found: " + totalExceptions);
    }
}
