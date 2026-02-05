package javacollectionsandstreams.regexandjunit;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTest {

    // ---- Class with Exception ----
    class Calculator {

        int divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return a / b;
        }
    }

    Calculator calc = new Calculator();

    // ---- Test Case ----
    @Test
    void testDivideByZeroException() {
        assertThrows(ArithmeticException.class,
                () -> calc.divide(10, 0));
    }
}

