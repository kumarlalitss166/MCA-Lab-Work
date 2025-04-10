import java.util.Scanner;
import java.util.StringTokenizer;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter text:");
        String text = scanner.nextLine();

        // Counting words
        StringTokenizer words = new StringTokenizer(text);
        int wordCount = words.countTokens();

        // Counting sentences
        StringTokenizer sentences = new StringTokenizer(text, ".!?\n");
        int sentenceCount = sentences.countTokens();

        // Counting occurrences of 'e' and 'z'
        int countE = 0, countZ = 0;
        for (char ch : text.toCharArray()) {
            if (ch == 'e' || ch == 'E') countE++;
            if (ch == 'z' || ch == 'Z') countZ++;
        }

        // Display results
        System.out.println("The Number Of Words is : " + wordCount);
        System.out.println("The Number Of Sentences is : " + sentenceCount);
        System.out.println("The Number Of Time E Occurs: " + countE);
        System.out.println("The Number Of Time Z Occurs: " + countZ);
        
        scanner.close();
    }
}
