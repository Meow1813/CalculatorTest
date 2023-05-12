package Test.CalculatorTest.service;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorServiceImplTest {
    CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    void plusNumbers() {
        String answer = "56 + 28 = 84";
        assertEquals(answer, out.plus("56", "28"));
    }

    @Test
    void plusNegativeNumbers() {
        String answer = "-4 + -6 = -10";
        assertEquals(answer, out.plus("-4", "-6"));
    }

    @Test
    void minusNumbers() {
        String answer = "56 - 28 = 28";
        assertEquals(answer, out.minus("56", "28"));
    }

    @Test
    void minusNegativeNumbers() {
        String answer = "-4 - -6 = 2";
        assertEquals(answer, out.minus("-4", "-6"));
    }

    @Test
    void multiplyNumbers() {
        String answer = "56 * 28 = 1568";
        assertEquals(answer, out.multiply("56", "28"));
    }

    @Test
    void multiplyNegativeNumbers() {
        String answer = "-4 * -6 = 24";
        assertEquals(answer, out.multiply("-4", "-6"));
    }

    @Test
    void divideNumbers() {
        String answer = "56 / 28 = 2";
        assertEquals(answer, out.divide("56", "28"));
    }

    @Test
    void divideNegativeNumbers() {
        String answer = "-8 / -2 = 4";
        assertEquals(answer, out.divide("-8", "-2"));
    }

    @Test
    void divideZero() {
        assertThrows(IllegalArgumentException.class, () -> out.divide("2", "0"));
    }
}