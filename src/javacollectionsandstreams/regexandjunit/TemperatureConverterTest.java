package javacollectionsandstreams.regexandjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    // ---- Class ----
    class TemperatureConverter {

        double celsiusToFahrenheit(double c) {
            return (c * 9 / 5) + 32;
        }

        double fahrenheitToCelsius(double f) {
            return (f - 32) * 5 / 9;
        }
    }

    TemperatureConverter tc = new TemperatureConverter();

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(98.6, tc.celsiusToFahrenheit(37), 0.1);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0, tc.fahrenheitToCelsius(32), 0.1);
    }
}
