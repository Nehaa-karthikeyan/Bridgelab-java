package javacollectionsandstreams.regexandjunit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledTestExample {

    @Test
    @Disabled
    void testNotExecuted() {
        // This test will be skipped
    }
}
