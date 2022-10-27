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
            if (numbers.startsWith("//")) {
                String[] parts = numbers.substring(2).split("\n");
                result = addNumbers(parts[1], parts[0]);
            }
            else {
                result = addNumbers(numbers, "[,\\n]");
            }
        }
        return result;
    }

    public int addNumbers(String numbers, String delimiter) {
        int result = 0;
        String[] strings = numbers.split(delimiter);
        for (int i = 0; i < strings.length; i ++)
            result += Integer.valueOf(strings[i]);
        return result;
    }
}
