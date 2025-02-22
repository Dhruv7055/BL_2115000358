public class ReplaceMultipleSpaces {
    public static String replaceSpaces(String input) {
        return input.replaceAll("\\s+", " ").trim();
    }

    public static void main(String[] args) {
        String input = "This    is  an  example   with  multiple   spaces.";
        String result = replaceSpaces(input);
        System.out.println("Original: " + input);
        System.out.println("Modified: " + result);
    }
}