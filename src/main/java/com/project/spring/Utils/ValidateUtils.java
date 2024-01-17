package com.project.spring.Utils;

import com.project.spring.exceptions.UnsupportedMathOperationException;

public class ValidateUtils {

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null) {
            return false;
        }
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public static void validateParams(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Valores informados pra a soma devem ser valores numericos");
        }
    }

}
