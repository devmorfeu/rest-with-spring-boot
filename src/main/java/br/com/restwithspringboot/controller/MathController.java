package br.com.restwithspringboot.controller;

import br.com.restwithspringboot.controller.model.output.Result;
import br.com.restwithspringboot.service.SimpleMathService;
import br.com.restwithspringboot.utils.Converter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Digits;
import java.math.BigDecimal;

import static org.springframework.http.HttpStatus.*;

@Validated
@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class MathController {

    private final SimpleMathService service;

    private final Converter converter;

    @GetMapping(value = "/sum/{numberOne}/{numberTwo}")
    public ResponseEntity<Result> sum(@PathVariable("numberOne") @Digits(integer = 3, fraction = 2) String numberOne, @PathVariable("numberTwo") @Digits(integer = 3, fraction = 2) String numberTwo){

        var listNumbers = converter.toListBigDecimal(numberOne, numberTwo);

        var response = service.sum(listNumbers);

        return ResponseEntity.status(OK).body(response);
    }

    @GetMapping(value = "/subtraction/{numberOne}/{numberTwo}")
    public ResponseEntity<Result> subtraction(@PathVariable("numberOne") @Digits(integer = 3, fraction = 2) String numberOne, @PathVariable("numberTwo") @Digits(integer = 3, fraction = 2) String numberTwo){

        var listNumbers = converter.toListBigDecimal(numberOne, numberTwo);

        var response = service.subtract(listNumbers);

        return ResponseEntity.status(OK).body(response);
    }

    @GetMapping(value = "multiplication/{numberOne}/{numberTwo}")
    public ResponseEntity<Result> multiplication(@PathVariable("numberOne") @Digits(integer = 3, fraction = 2) String numberOne, @PathVariable("numberTwo") @Digits(integer = 3, fraction = 2) String numberTwo){

        var listNumbers = converter.toListBigDecimal(numberOne, numberTwo);

        var response = service.multiplication(listNumbers);

        return ResponseEntity.status(OK).body(response);
    }

    @GetMapping(value = "division/{numberOne}/{numberTwo}")
    public ResponseEntity<Result> division(@PathVariable("numberOne") @Digits(integer = 3, fraction = 2) String numberOne, @PathVariable("numberTwo") @Digits(integer = 3, fraction = 2) String numberTwo){

        var listNumbers = converter.toListBigDecimal(numberOne, numberTwo);

        var response = service.division(listNumbers);

        return ResponseEntity.status(OK).body(response);
    }

    @GetMapping(value = "average/{numberOne}/{numberTwo}")
    public ResponseEntity<Result> average(@PathVariable("numberOne") @Digits(integer = 3, fraction = 2) String numberOne, @PathVariable("numberTwo") @Digits(integer = 3, fraction = 2) String numberTwo){

        var listNumbers = converter.toListBigDecimal(numberOne, numberTwo);

        var response = service.average(listNumbers);

        return ResponseEntity.status(OK).body(response);

    }

    @GetMapping(value = "squareRoot/{number}")
    public ResponseEntity<Result> squareRoot(@PathVariable("number") @Digits(integer = 3, fraction = 2) String number){

        var response = service.squareRoot(new BigDecimal(number));

        return ResponseEntity.status(OK).body(response);
    }


}
