import java.util.regex.*;

class UsernameValidator {
    public static boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
    }
    
    public static void main(String[] args) {
        System.out.println(isValidUsername("user_123")); // true
        System.out.println(isValidUsername("123user")); // false
        System.out.println(isValidUsername("us")); // false
    }
}