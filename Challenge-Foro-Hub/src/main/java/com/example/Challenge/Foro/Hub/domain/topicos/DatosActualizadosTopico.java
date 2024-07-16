package com.example.Challenge.Foro.Hub.domain.topicos;

import jakarta.validation.constraints.NotNull;

public record DatosActualizadosTopico(
        @NotNull
        Long id,
        String titulo,
        String mensaje,
        String curso

) {
}
