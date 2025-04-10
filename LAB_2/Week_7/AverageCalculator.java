import java.io.*;
import java.util.*;

class DataProcessor{
    public static void readValuesFromFile(String filePath){
        try {
            FileInputStream myFile = new FileInputStream(filePath);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(myFile));
            List<String> values = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] tokens = line.split("\\s+");
                for(String token :tokens){
                    values.add(token);
                }
            }
            
        } catch (IOException e) {
            System.out.println("Error: Unable to read file");
        }
    }
}
