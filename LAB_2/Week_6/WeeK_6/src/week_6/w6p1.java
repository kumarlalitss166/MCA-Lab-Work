package week_6;

import java.util.StringTokenizer;
public class w6p1 {
    public static void main(String[] args){
        String text = "I said to him: Go ye, now!";

        StringTokenizer words = new StringTokenizer(text, " :,!", true);
        
        System.out.println("Input: " + text);
        System.out.print("Output: ");
        
        while (words.hasMoreTokens()){
            String word = words.nextToken();
            String swappedWord = wordSwapper(word, 0, word.length() - 1);
            
            System.out.print(swappedWord);
        }
    }

    public static String wordSwapper(String str, int i, int j){
        if (str == null || str.length() == 1){
            return str;
        }

        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);    
    }
}
