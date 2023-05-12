package Test.CalculatorTest.service;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorServiceImplParametrizedTest {
    CalculatorServiceImpl out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("paramsForPlusTest")
    void plusTest(String num1, String num2, String result) {
        assertEquals(result, out.plus(num1, num2));
    }

    public static Stream<Arguments> paramsForPlusTest() {
        return Stream.of(
                Arguments.of("56", "28", "56 + 28 = 84"),
                Arguments.of("-4", "-6", "-4 + -6 = -10")
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForMinusTest")
    void minusTest(String num1, String num2, String result) {
        assertEquals(result, out.minus(num1, num2));
    }

    public static Stream<Arguments> paramsForMinusTest() {
        return Stream.of(
                Arguments.of("56", "28", "56 - 28 = 28"),
                Arguments.of("-4", "-6", "-4 - -6 = 2")
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForMultiplyTest")
    void multiplyTest(String num1, String num2, String result) {
        assertEquals(result, out.multiply(num1, num2));
    }

    public static Stream<Arguments> paramsForMultiplyTest() {
        return Stream.of(
                Arguments.of("56", "28", "56 * 28 = 1568"),
                Arguments.of("-4", "-6", "-4 * -6 = 24")
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForDivideTest")
    void divideTest(String num1, String num2, String result) {
        assertEquals(result, out.divide(num1, num2));
    }

    public static Stream<Arguments> paramsForDivideTest() {
        return Stream.of(
                Arguments.of("56", "28", "56 / 28 = 2"),
                Arguments.of("-8", "-2", "-8 / -2 = 4")
        );
    }


}