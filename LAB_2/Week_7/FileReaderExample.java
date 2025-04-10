import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        String filePath = "input.txt"; // File to be read

        try {
            // Open the file for reading
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            // Read and print each line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the file after reading
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + filePath);
        } catch (IOException e) {
            System.out.println("Error: An issue occurred while reading the file.");
        }
    }
}
