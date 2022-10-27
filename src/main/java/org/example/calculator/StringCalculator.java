package org.example.calculator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StringCalculator {
    private static Logger stringCalculatorLogger = Logger.getLogger("stringCalculatorLogger");

    public int Add(String numbers) {
        stringCalculatorLogger.log(Level.INFO, "Method start");
        return 0;
    }
}
