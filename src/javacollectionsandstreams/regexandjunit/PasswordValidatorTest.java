package javacollectionsandstreams.regexandjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    // ---- Class ----
    class PasswordValidator {

        boolean isValid(String password) {
            return password.length() >= 8 &&
                    password.matches(".*[A-Z].*") &&
                    password.matches(".*\\d.*");
        }
    }

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("JavaTest1"));
    }

    @Test
    void testInvalidPassword() {
        assertFalse(validator.isValid("java"));
    }
}

