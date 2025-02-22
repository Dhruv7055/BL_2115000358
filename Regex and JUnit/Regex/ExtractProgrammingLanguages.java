import java.util.regex.*;
import java.util.*;

public class ExtractProgrammingLanguages {
    public static List<String> extractLanguages(String text) {
        String regex = "\\b(Java|Python|JavaScript|Go)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> languages = new ArrayList<>();
        while (matcher.find()) {
            languages.add(matcher.group());
        }
        return languages;
    }

    public static void main(String[] args) {
        String input = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> result = extractLanguages(input);
        System.out.println("Extracted Languages: " + result);
    }
}