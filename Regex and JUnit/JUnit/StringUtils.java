
public class StringUtils {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverse(str));
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }
}

