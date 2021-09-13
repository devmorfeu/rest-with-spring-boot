package br.com.restwithspringboot.controller.model.output;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Result {

    @JsonProperty("result")
    private BigDecimal resultMath;
}
