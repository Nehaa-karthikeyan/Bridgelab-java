package javacollectionsandstreams.regexandjunit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class PerformanceTest {

    // ---- Method ----
    void longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
    }

    // ---- Test Case ----
    @Test
    @Timeout(2)
    void testTimeout() throws InterruptedException {
        longRunningTask();
    }
}

