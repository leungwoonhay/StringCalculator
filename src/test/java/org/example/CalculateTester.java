package org.example;

import org.example.calculator.StringCalculator;
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
    public void testEmptyString() {
        int result = stringCalculator.Add("");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testOneNumber() {
        int result = stringCalculator.Add("1");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testTwoNumber() {
        int result = stringCalculator.Add("1,2");
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testUnknownNumberofNumbers() {
        int result = stringCalculator.Add("1,2,3,4,5");
        Assertions.assertEquals(15, result);
    }
}
