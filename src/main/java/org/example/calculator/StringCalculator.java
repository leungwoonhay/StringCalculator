package org.example.calculator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StringCalculator {
    private static Logger stringCalculatorLogger = Logger.getLogger("stringCalculatorLogger");

    public int Add(String numbers) {
        int result = 0;
        stringCalculatorLogger.log(Level.INFO, "Method start");
        if (numbers.equals(""))
            result = 0;
        else {
            String[] strings = numbers.split("[,\\n]");
            for (int i = 0; i < strings.length; i ++)
                result += Integer.valueOf(strings[i]);
        }
        return result;
    }
}
