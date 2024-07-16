package com.example.Challenge.Foro.Hub.domain.topicos;
import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String curso


) {


}
