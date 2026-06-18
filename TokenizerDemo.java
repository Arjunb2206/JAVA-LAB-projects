import java.util.StringTokenizer;

public class TokenizerDemo {
    public static void main(String[] args) {
        String sentence = "Java programming is fun";
        StringTokenizer st = new StringTokenizer(sentence);

        int count = st.countTokens();
        System.out.println("Total Words: " + count);

        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            System.out.println(word + " (Length: " + word.length() + ")");
        }
    }
}
 