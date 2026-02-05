package javacollectionsandstreams.regexandjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertAllTest {

    @Test
    void testMultipleAssertions() {
        assertAll(
                () -> assertEquals(4, 2 + 2),
                () -> assertTrue("JUnit".startsWith("J")),
                () -> assertFalse(5 < 3)
        );
    }
}

