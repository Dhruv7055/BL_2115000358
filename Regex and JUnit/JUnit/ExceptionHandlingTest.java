
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ExceptionHandlingTest {
    @Test
    void testDivide() {
        assertEquals(2, ExceptionHandling.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> ExceptionHandling.divide(5, 0));
    }
}



