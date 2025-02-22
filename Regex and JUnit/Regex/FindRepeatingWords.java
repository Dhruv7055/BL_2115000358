import java.util.regex.*;
import java.util.HashSet;

public class FindRepeatingWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        findRepeatingWords(text);
    }

    public static void findRepeatingWords(String text) {
        Pattern pattern = Pattern.compile("\\b(\\w+)\\b(?:\\s+\\b\\1\\b)+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        HashSet<String> repeatingWords = new HashSet<>();
        
        while (matcher.find()) {
            repeatingWords.add(matcher.group(1));
        }
        
        System.out.println(repeatingWords);
    }
}