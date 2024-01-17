package com.project.spring.Utils;

import com.project.spring.exceptions.UnsupportedMathOperationException;

public class ConvertionUtils {

    public static Double convertoToDouble(String strNumber) throws Exception {
        if (strNumber == null) {
            throw new UnsupportedMathOperationException("Valores informados nao podem ser nulos");
        }

        String number = strNumber.replaceAll(",", ".");

        if(ValidateUtils.isNumeric(number)) {
            return Double.parseDouble(number);
        }

        return 0D;
    }

}
