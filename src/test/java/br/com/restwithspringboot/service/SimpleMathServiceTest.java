package br.com.restwithspringboot.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SimpleMathServiceTest {

    @InjectMocks
    private SimpleMathService service;

    List<BigDecimal> numbers = asList(BigDecimal.TEN, BigDecimal.TEN);

    @Test
    public void given_the_correct_numbers_then_return_the_sum() {

        final var result = service.sum(numbers);

        assertEquals(new BigDecimal(20), result.getResultMath());
    }

    @Test
    public void given_the_correct_numbers_then_return_the_subtracts() {

        final var result = service.subtract(numbers);

        assertEquals(new BigDecimal(0), result.getResultMath());
    }

    @Test
    public void given_the_correct_numbers_then_return_the_multiply() {

        final var result = service.multiplication(numbers);

        assertEquals(new BigDecimal(100), result.getResultMath());
    }

    @Test
    public void given_the_correct_numbers_then_return_the_division() {

        final var result = service.division(numbers);

        assertEquals(new BigDecimal(1), result.getResultMath());
    }

    @Test
    public void given_the_correct_numbers_then_return_the_average() {

        final var result = service.average(numbers);

        assertEquals(new BigDecimal(10), result.getResultMath());
    }

    @Test
    public void given_the_correct_numbers_then_return_the_square_root() {

        final var result = service.squareRoot(BigDecimal.TEN);

        assertEquals(new BigDecimal("3.2"), result.getResultMath());
    }
}