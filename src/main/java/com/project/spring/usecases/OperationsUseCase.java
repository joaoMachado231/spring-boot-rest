package com.project.spring.usecases;

import com.project.spring.Utils.ConvertionUtils;
import com.project.spring.Utils.ValidateUtils;
import com.project.spring.exceptions.UnsupportedMathOperationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationsUseCase {

    public Double sum(String numberOne, String numberTwo) throws Exception {
        ValidateUtils.validateParams(numberOne, numberTwo);

        return ConvertionUtils.convertoToDouble(numberOne) + ConvertionUtils.convertoToDouble(numberTwo);
    }

    public Double sub(String numberOne, String numberTwo) throws Exception {
        ValidateUtils.validateParams(numberOne, numberTwo);

        return ConvertionUtils.convertoToDouble(numberOne) - ConvertionUtils.convertoToDouble(numberTwo);
    }

    public Double mult(String numberOne, String numberTwo) throws Exception {
        ValidateUtils.validateParams(numberOne, numberTwo);

        return ConvertionUtils.convertoToDouble(numberOne) * ConvertionUtils.convertoToDouble(numberTwo);
    }

    public Double div(String numberOne, String numberTwo) throws Exception {
        ValidateUtils.validateParams(numberOne, numberTwo);

        return ConvertionUtils.convertoToDouble(numberOne) / ConvertionUtils.convertoToDouble(numberTwo);
    }

    public Double sqrt(String numberOne) throws Exception {
        ValidateUtils.validateParams(numberOne, "0");

        return Math.sqrt(ConvertionUtils.convertoToDouble(numberOne));
    }

    public Double avrg(List<Double> numberList) throws Exception {
        Double itemsSum = 0D;

        for(Double num : numberList) {
            if(!ValidateUtils.isNumeric(num.toString())) {
                throw new UnsupportedMathOperationException("Valores informados pra a soma devem ser valores numericos");
            }
            itemsSum += num;
        }

        return itemsSum / numberList.size();
    }

}
