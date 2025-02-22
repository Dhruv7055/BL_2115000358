
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class PasswordValidator {
    public static boolean isValid(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*");
    }
}

class PasswordValidatorTest {
    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValid("Strong1"));
    }

    @Test
    void testShortPassword() {
        assertFalse(PasswordValidator.isValid("Weak1"));
    }

    @Test
    void testNoUpperCase() {
        assertFalse(PasswordValidator.isValid("strong1"));
    }

    @Test
    void testNoDigit() {
        assertFalse(PasswordValidator.isValid("StrongPass"));
    }
}

