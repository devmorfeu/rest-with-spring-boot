package br.com.restwithspringboot.utils;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

import static java.util.Arrays.asList;

@Component
public class Converter {

    public List<BigDecimal> toListBigDecimal(String numberOne, String numberTwo) {
        return asList(new BigDecimal(numberOne), new BigDecimal(numberTwo));
    }
}