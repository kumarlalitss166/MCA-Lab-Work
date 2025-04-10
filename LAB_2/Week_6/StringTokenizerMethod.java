import java.util.StringTokenizer;
public class StringTokenizerMethod {
    public static void main(String[] args){
        String text = "I said to him: Go ye, now!";

        StringTokenizer tokenizer = new StringTokenizer(text, " ,!:", true);

        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            if (!token.equals(" ")){
                System.out.println(token);
            }
        }
    }
}
