package br.com.luis.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math Operations in SimpleMath Class ")
public class SimpleMathTest {
    // test[SytenUnderTest]_[Condition or State change]_[Expected Result]
    @Test
    @DisplayName("Test 6.2 +2 =8.2")
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
        // AAA Arrange,Act Assert
        // Given / Arrange
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        double expected = 8.2D;
        // When / Act
        Double actual = math.sum(firstNumber, secondNumber);
        // Then / Assert
        Assertions.assertEquals(expected, actual,
                () -> firstNumber + "+" + secondNumber + "dis not produce" + expected + "!");
    }

    @Test
    void testSubstraction() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.subtraction(firstNumber, secondNumber);
        double expected = 4.2D;
        Assertions.assertEquals(expected, actual,
                () -> firstNumber + "-" + secondNumber + "dis not produce" + expected + "!");

    }

    @Test
    void testMultiplication() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.multiplication(firstNumber, secondNumber);
        double expected = 12.4D;
        Assertions.assertEquals(expected, actual,
                () -> firstNumber + "*" + secondNumber + "dis not produce" + expected + "!");

    }

    // @Test
    // @d
    // void
    // testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException()
    // {
    // fail();
    // }

    @Test
    void testDivision() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.division(firstNumber, secondNumber);
        double expected = 3.1D;
        Assertions.assertEquals(expected, actual,
                () -> firstNumber + "/" + secondNumber + "dis not produce" + expected + "!");

    }

    @Test
    void testmean() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.mean(firstNumber, secondNumber);
        double expected = 4.1D;
        Assertions.assertEquals(expected, actual,
                () -> "(" + firstNumber + "+" + secondNumber + ")/2" + "dis not produce" + expected + "!");

    }

    @Test
    void testSquareRoot() {
        SimpleMath math = new SimpleMath();
        double number = 81D;
        double expected = 9D;
        Double actual = math.squareRoot(number);

        Assertions.assertEquals(expected, actual, () -> "Square root of" + number + "dis not produce" + expected + "!");

    }

    @DisplayName("")
    @Test
    void testABCD_WHEN_XYZ_SHOULD() {
        // GIVEN / ARRANGE
        // WHEN / ACT
        // THEN / ASSERT
    }
}
