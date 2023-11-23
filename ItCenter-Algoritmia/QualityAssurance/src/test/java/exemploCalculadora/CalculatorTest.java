package exemploCalculadora;

import org.example.Ex_01.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddNumber() {
        int result = calculator.add(2,3);
        assertEquals(5, result);
    }

    @Test
    public void testDivide() {
        int result = calculator.divide(10,2);
        assertEquals(5, result);
        result = calculator.divide(8,2);
        assertEquals(4, result);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    @Test
    public void testeMultiply() {
        int result = calculator.multiply(5,2);
        assertEquals(10, result);
    }

    @Test
    public void testeSubtract() {
        int result = calculator.subtract(10,5);
        assertEquals(5, result);
    }
}
