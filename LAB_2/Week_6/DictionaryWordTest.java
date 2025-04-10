import java.util.Arrays;
public class DictionaryWordTest {
    public static void main(String[] args){
        String text = "Charlie Able Banker";
        String[] words = text.split("\\s+");
        Arrays.sort(words);
        for (String word : words) {
            System.out.print(word + " ");
        }        
    }
}
