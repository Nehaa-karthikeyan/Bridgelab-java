package javacollectionsandstreams.regexandjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    // ---- Class ----
    class UserRegistration {

        void registerUser(String username, String email, String password) {
            if (username.isEmpty() || !email.contains("@") || password.length() < 8) {
                throw new IllegalArgumentException("Invalid input");
            }
        }
    }

    UserRegistration ur = new UserRegistration();

    @Test
    void testValidUser() {
        assertDoesNotThrow(() ->
                ur.registerUser("Nehaa", "nehaa@gmail.com", "JavaTest1"));
    }

    @Test
    void testInvalidUser() {
        assertThrows(IllegalArgumentException.class, () ->
                ur.registerUser("", "nehaagmail.com", "123"));
    }
}

