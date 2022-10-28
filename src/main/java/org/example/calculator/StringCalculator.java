package org.example.calculator;

import org.example.exception.NegativeNotAllowedException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringCalculator {
    private static Logger stringCalculatorLogger = Logger.getLogger("stringCalculatorLogger");

    public int Add(String numbers) throws NegativeNotAllowedException {
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

    public int addNumbers(String numbers, String delimiter) throws NegativeNotAllowedException {
        int result = 0;
        List<String> negativeNumber = new ArrayList<>();

        String[] strings = numbers.split(delimiter);
        for (int i = 0; i < strings.length; i ++)
            if (Integer.valueOf(strings[i]) < 0)
                negativeNumber.add(strings[i]);
            else
                result += Integer.valueOf(strings[i]);

        if (negativeNumber.size() > 0) {
            String message = "Negatives not allowed: ";
            for (int i = 0; i < negativeNumber.size(); i ++)
                message += negativeNumber.get(i) + ",";
            message = message.substring(0, message.length() - 1);

            throw new NegativeNotAllowedException(message);
        }

        return result;
    }
}
