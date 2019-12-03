import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator test = new Calculator();
        int sum = test.add(3,3);
        assertEquals(6, sum);
    }

    @Test
    void addMany() {
        Calculator test = new Calculator();
        int sum = test.addMany(2, 2, 2, 5);
        assertEquals(11, sum);
    }

    @Test
    void multiply() {
        Calculator test = new Calculator();
        int sum = test.multiply(6,2);
        assertEquals(12, sum);
    }

    @Test
    void multiplyMany() {
        Calculator test = new Calculator();
        int sum = test.multiplyMany(2, 2, 2, 5);
        assertEquals(40, sum);
    }
}