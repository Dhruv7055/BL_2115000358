import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

class FileProcessorTest {
    private static final String FILE_NAME = "testfile.txt";

    static void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        }
    }

    static String readFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.readLine();
        }
    }

    @Test
    void testFileWriteRead() throws IOException {
        String content = "Hello, File!";
        writeToFile(FILE_NAME, content);
        assertEquals(content, readFromFile(FILE_NAME));
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        writeToFile(FILE_NAME, "Test");
        assertTrue(new File(FILE_NAME).exists());
    }

    @Test
    void testFileReadException() {
        assertThrows(IOException.class, () -> readFromFile("nonexistent.txt"));
    }
}