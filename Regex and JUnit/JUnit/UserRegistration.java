
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


class UserRegistration {
   public static void registerUser(String username, String email, String password) {
       if (username.isEmpty() || email.isEmpty() || password.length() < 8) {
           throw new IllegalArgumentException("Invalid user details");
       }
   }
}


class UserRegistrationTest {
   @Test
   void testValidUser() {
       assertDoesNotThrow(() -> UserRegistration.registerUser("JohnDoe", "john@example.com", "Password1"));
   }


   @Test
   void testInvalidUserEmptyFields() {
       assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("", "", ""));
   }


   @Test
   void testInvalidPassword() {
       assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "john@example.com", "short"));
   }
}

