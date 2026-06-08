package br.com.ms_ciaarea.companhiaarea.dto;

import jakarta.validation.constraints.NotBlank;

public record CompanhiaAereaDTO(
        @NotBlank String nome,
        @NotBlank String codigoIata,
        String pais
) {}