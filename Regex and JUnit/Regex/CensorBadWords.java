public class CensorBadWords {
    public static String censorText(String input) {
        String[] badWords = {"damn", "stupid"};
        for (String word : badWords) {
            input = input.replaceAll("(?i)" + word, "****");
        }
        return input;
    }

    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";
        String result = censorText(input);
        System.out.println("Original: " + input);
        System.out.println("Censored: " + result);
    }
}