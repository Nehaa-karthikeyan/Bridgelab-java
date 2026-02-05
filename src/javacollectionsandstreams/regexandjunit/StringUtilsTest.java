package javacollectionsandstreams.regexandjunit;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    // ---- StringUtils Class ----
    class StringUtils {

        String reverse(String str) {
            return new StringBuilder(str).reverse().toString();
        }

        boolean isPalindrome(String str) {
            String rev = reverse(str);
            return str.equals(rev);
        }

        String toUpperCase(String str) {
            return str.toUpperCase();
        }
    }

    StringUtils utils = new StringUtils();

    // ---- Test Cases ----
    @Test
    void testReverse() {
        assertEquals("olleh", utils.reverse("hello"));
    }

    @Test
    void testPalindromeTrue() {
        assertTrue(utils.isPalindrome("madam"));
    }

    @Test
    void testPalindromeFalse() {
        assertFalse(utils.isPalindrome("java"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("JAVA", utils.toUpperCase("java"));
    }
}
