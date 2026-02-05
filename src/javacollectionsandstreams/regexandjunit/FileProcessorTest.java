package javacollectionsandstreams.regexandjunit;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {

    // ---- Class ----
    class FileProcessor {

        void writeToFile(String filename, String content) throws IOException {
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
            writer.close();
        }

        String readFromFile(String filename) throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            return reader.readLine();
        }
    }

    FileProcessor fp = new FileProcessor();

    @Test
    void testWriteAndRead() throws Exception {
        String file = "test.txt";
        fp.writeToFile(file, "Hello");
        assertEquals("Hello", fp.readFromFile(file));
    }

    @Test
    void testFileNotFound() {
        assertThrows(IOException.class,
                () -> fp.readFromFile("nofile.txt"));
    }
}

