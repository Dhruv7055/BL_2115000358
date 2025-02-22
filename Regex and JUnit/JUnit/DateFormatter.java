import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
    public static String formatDate(String inputDate) throws ParseException {
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = inputFormat.parse(inputDate);
        return outputFormat.format(date);
    }
}

class DateFormatterTest {
    @Test
    void testValidDate() throws ParseException {
        assertEquals("25-12-2023", DateFormatter.formatDate("2023-12-25"));
    }
    
    @Test
    void testInvalidDate() {
        assertThrows(ParseException.class, () -> DateFormatter.formatDate("invalid-date"));
    }
}

