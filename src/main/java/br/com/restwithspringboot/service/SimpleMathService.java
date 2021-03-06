package br.com.restwithspringboot.service;

import br.com.restwithspringboot.controller.model.output.Result;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;

import static java.math.RoundingMode.HALF_EVEN;

@Service
public class SimpleMathService {

    public Result sum(List<BigDecimal> numbers) { return new Result(numbers.stream().reduce(BigDecimal.ZERO, BigDecimal::add)); }

    public Result subtract(List<BigDecimal> numbers) { return new Result(numbers.get(0).subtract(numbers.get(1)));};

    public Result multiplication(List<BigDecimal> numbers) { return new Result(numbers.get(0).multiply(numbers.get(1)));}

    public Result division(List<BigDecimal> numbers) { return new Result(numbers.get(0).divide(numbers.get(1), HALF_EVEN));}

    public Result average(List<BigDecimal> numbers) { return new Result(numbers.stream().reduce(BigDecimal.ZERO, BigDecimal::add).divide(new BigDecimal(2), HALF_EVEN));}

    public Result squareRoot(BigDecimal number) { return new Result(number.sqrt(new MathContext(2))); }}