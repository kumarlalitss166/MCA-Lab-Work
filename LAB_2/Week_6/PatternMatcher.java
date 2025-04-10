import java.util.ArrayList;
import java.util.regex.*;
public class PatternMatcher{
    public static void main(String[] args){
        String text = "I said to him: Go ye, now!";

        Pattern pattern = Pattern.compile("\\w+|[.,!?']");
        Matcher matcher =pattern.matcher(text);

        ArrayList<String> tokens = new ArrayList<>();
        
        while (matcher.find()){
            tokens.add(matcher.group());
        }

        for (String token : tokens){
            System.out.println(token);
        }
    }
}


