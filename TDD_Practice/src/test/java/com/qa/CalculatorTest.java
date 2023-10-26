package com.qa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.rmi.UnexpectedException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add Positive Ints Gives Positive Correct Value")
    public void add_1_and_2_results_in_3() {
//        Triple 'A' pattern
//        Arrange - gather anything we need
        int num1 = 1;
        int num2 = 2;
        int expectedResult = 3;
//        instantiate here if necessary
//        Calculator calc = new Calculator();

//        Act - invoke the code we are testing
        int actualResult = Calculator.add(num1, num2);

//        Assert - confirm the results
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void add_2_and_2_results_in_4() {
        int num1 = 2;
        int num2 = 2;
        int expectedResult = 4;

        int actualResult = Calculator.add(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

//    create more 'add' tests
    @Test
    public void add_n1_and_n2_results_in_n3() {
        int num1 = -1;
        int num2 = -2;
        int expectedResult = -3;

        int actualResult = Calculator.add(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void add_LargeNum_and_LargeNum_results() {
        int num1 = 13000;
        int num2 = 13000;
        int expectedResult = 26000;

        int actualResult = Calculator.add(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void add_LargeNegativeNum_and_LargeNegativeNum_results() {
        int num1 = -13000;
        int num2 = -13000;
        int expectedResult = -26000;

        int actualResult = Calculator.add(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void add_LargeNegativeNum_and_0_results() {
        int num1 = -13000;
        int num2 = 0;
        int expectedResult = -13000;

        int actualResult = Calculator.add(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

//    create some 'subtract' tests using TDD
    @Test
    public void subtract_1_and_1_results_in_0() {
        int num1 = 1;
        int num2 = 1;
        int expectedResult = 0;

        int actualResult = Calculator.subtract(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void subtract_15_and_3_results_in_12() {
        int num1 = 15;
        int num2 = 3;
        int expectedResult = 12;

        int actualResult = Calculator.subtract(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void subtract_3_and_10_results_in_N7() {
        int num1 = 3;
        int num2 = 10;
        int expectedResult = -7;

        int actualResult = Calculator.subtract(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Divide Positive Integes Throws Exception")
//    testing exceptions
    public void divide_PositiveNumber_10_and_0_ThrowsException() {
        int num1 = 10;
        int num2 = 0;

//        lambda, an anonymous function
        assertThrows(ArithmeticException.class, () -> Calculator.divide(num1, num2));
    }

    @Test
    public void divide_PositiveDouble_3_and_2_results() {
        double num1 = 3;
        double num2 = 2;
        double expectedResult = 1.5;

        double actualResult = Calculator.divide(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Divide Positive Integer By 0 Gives Positive Infinity")
    public void divide_PositiveDouble_15_and_0_results_in_inf() {
        double num1 = 15;
        double num2 = 0;
        double expectedResult = Double.POSITIVE_INFINITY;

        double actualResult = Calculator.divide(num1, num2);

        assertEquals(expectedResult, actualResult);
    }
}