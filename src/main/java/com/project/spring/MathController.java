package com.project.spring;

import com.project.spring.usecases.OperationsUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class MathController {

    public OperationsUseCase operationsUseCase;

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        return operationsUseCase.sum(numberOne, numberTwo);
    }

    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sub(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        return operationsUseCase.sub(numberOne, numberTwo);
    }

    @RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mult(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        return operationsUseCase.mult(numberOne, numberTwo);
    }

    @RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double div(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        return operationsUseCase.div(numberOne, numberTwo);
    }

    @RequestMapping(value = "/avrg", method = RequestMethod.POST)
    public Double avrg(
            @RequestBody() List<Double> numberList
    ) throws Exception {
        return operationsUseCase.avrg(numberList);
    }

    @RequestMapping(value = "/sqrt/{numberOne}", method = RequestMethod.GET)
    public Double sqrt(
            @PathVariable() String numberOne
    ) throws Exception {
        return operationsUseCase.sqrt(numberOne);
    }
}
