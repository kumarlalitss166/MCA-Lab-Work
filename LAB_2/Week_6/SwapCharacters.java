public class SwapCharacters {
    public static void main(String[] args){
        String word = "hello";
        System.out.println("Before Swap: " + word);

        String swappedWord = swapCharacters(word, 0, word.length() - 1);
        System.out.println("After Swap: " + swappedWord);
        // char[] letters = {'y', 'e', 's'};
        // String word2 = new String(letters);
        // System.out.println(word2);
    }
    public static String swapCharacters(String str, int i, int j){
        if (str == null || str.length() < 2) {
            return str;
        }

        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return new String(charArray);
    }
}
