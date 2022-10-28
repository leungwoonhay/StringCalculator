package org.example;

import org.example.calculator.StringCalculator;
import org.example.exception.NegativeNotAllowedException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculateTester {
    public static StringCalculator stringCalculator;

    @BeforeAll
    public static void setClass() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void testEmptyString() throws NegativeNotAllowedException {
        int result = stringCalculator.Add("");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testOneNumber() throws NegativeNotAllowedException {
        int result = stringCalculator.Add("1");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testTwoNumber() throws NegativeNotAllowedException {
        int result = stringCalculator.Add("1,2");
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testUnknownNumberOfNumbers() throws NegativeNotAllowedException {
        int result = stringCalculator.Add("1,2,3,4,5");
        Assertions.assertEquals(15, result);
    }

    @Test
    public void testNewLines() throws NegativeNotAllowedException {
        int result = stringCalculator.Add("1\n2,3");
        Assertions.assertEquals(6, result);
    }

    @Test
    public void testDifferentDelimiter() throws NegativeNotAllowedException {
        int result = stringCalculator.Add("//;\n1;2");
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testNegativeNumber() {
        NegativeNotAllowedException exception = Assertions.assertThrows(NegativeNotAllowedException.class, () -> stringCalculator.Add("-1,2"));
        Assertions.assertEquals("Negatives not allowed: -1", exception.getMessage());
    }

    @Test
    public void testNegativeNumber2() {
        NegativeNotAllowedException exception = Assertions.assertThrows(NegativeNotAllowedException.class, () -> stringCalculator.Add("2,-4,3,-5"));
        Assertions.assertEquals("Negatives not allowed: -4,-5", exception.getMessage());
    }

    @Test
    public void testGreaterThan1000() throws NegativeNotAllowedException {
        int result = stringCalculator.Add("1001,2");
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testDelimitersAnyLength() throws NegativeNotAllowedException {
        int result = stringCalculator.Add("//[|||]\n1|||2|||3");
        Assertions.assertEquals(6, result);
    }

}
