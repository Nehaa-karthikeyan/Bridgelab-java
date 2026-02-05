package javacollectionsandstreams.regexandjunit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {

    // ---- DatabaseConnection Class ----
    class DatabaseConnection {

        boolean connected = false;

        void connect() {
            connected = true;
        }

        void disconnect() {
            connected = false;
        }

        boolean isConnected() {
            return connected;
        }
    }

    DatabaseConnection db;

    // ---- Runs BEFORE each test ----
    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    // ---- Runs AFTER each test ----
    @AfterEach
    void tearDown() {
        db.disconnect();
    }

    // ---- Test Case ----
    @Test
    void testDatabaseConnection() {
        assertTrue(db.isConnected());
    }
}
