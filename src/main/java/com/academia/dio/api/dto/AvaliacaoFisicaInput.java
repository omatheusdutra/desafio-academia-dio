package com.academia.dio.api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Matheus
 */
@Getter
@Setter
public class AvaliacaoFisicaInput {

    @NotNull
    private Double peso;

    @NotNull
    private Double altura;
}
