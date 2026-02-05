package javacollectionsandstreams.regexandjunit;



import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class EvenCheckerTest {

    // ---- Class ----
    class EvenChecker {
        boolean isEven(int number) {
            return number % 2 == 0;
        }
    }

    EvenChecker checker = new EvenChecker();

    // ---- Test Cases ----
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void testEvenNumbers(int num) {
        assertTrue(checker.isEven(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testOddNumbers(int num) {
        assertFalse(checker.isEven(num));
    }
}
