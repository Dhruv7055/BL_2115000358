import java.util.regex.*;
import java.util.*;

class CapitalizedWordsExtractor {
    public static List<String> extractCapitalizedWords(String text) {
        List<String> words = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(text);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }
    
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        System.out.println(extractCapitalizedWords(text));
    }
}