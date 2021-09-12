package br.com.restwithspringboot.controller;

import br.com.restwithspringboot.service.SimpleMathService;
import br.com.restwithspringboot.utils.Converter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Converter.class, SimpleMathService.class})
public class MathControllerTest {

    private MockMvc mockMvc;

    @Mock
    private SimpleMathService simpleMathService;

    @Mock
    private Converter converter;

    @InjectMocks
    private MathController controller;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(this.controller).build();
    }

    @Test
    public void given_the_correct_numbers_for_sum_then_return_200() throws Exception {

        mockMvc.perform(get("/v1/sum/{numberOne}/{numberTwo}", "10", "10")
                .contentType("application/json"))
                .andExpect(status().is2xxSuccessful())
                .andReturn();

    }

    @Test
    public void given_the_correct_numbers_for_subtraction_then_return_200() throws Exception {

        mockMvc.perform(get("/v1/subtraction/{numberOne}/{numberTwo}","10","10" )
                .contentType("application/json"))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void given_the_correct_numbers_for_multiplication_then_return_200() throws Exception {

        mockMvc.perform(get("/v1/multiplication/{numberOne}/{numberTwo}","10","10" )
                .contentType("application/json"))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void given_the_correct_numbers_for_division_then_return_200() throws Exception {

        mockMvc.perform(get("/v1/division/{numberOne}/{numberTwo}","10","10" )
                .contentType("application/json"))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void given_the_correct_numbers_for_average_then_return_200() throws Exception {

        mockMvc.perform(get("/v1/average/{numberOne}/{numberTwo}","10","10" )
                .contentType("application/json"))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void given_the_correct_numbers_for_squareRoot_then_return_200() throws Exception {

        mockMvc.perform(get("/v1/squareRoot/{number}","10" )
                .contentType("application/json"))
                .andExpect(status().is2xxSuccessful());
    }
}
