package javacollectionsandstreams.regexandjunit;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterTest {

    // ---- Class ----
    class DateFormatter {

        String formatDate(String inputDate) {
            LocalDate date = LocalDate.parse(inputDate);
            return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }
    }

    DateFormatter df = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("15-08-2024", df.formatDate("2024-08-15"));
    }

    @Test
    void testInvalidDate() {
        assertThrows(Exception.class,
                () -> df.formatDate("15-08-2024"));
    }
}
