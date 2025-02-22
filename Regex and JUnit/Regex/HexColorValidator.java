import java.util.regex.*;

class HexColorValidator {
    public static boolean isValidHexColor(String color) {
        return color.matches("^#[0-9A-Fa-f]{6}$");
    }
    
    public static void main(String[] args) {
        System.out.println(isValidHexColor("#FFA500")); // true
        System.out.println(isValidHexColor("#ff4500")); // true
        System.out.println(isValidHexColor("#123")); // false
    }
}