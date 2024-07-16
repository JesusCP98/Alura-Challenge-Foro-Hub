package com.example.Challenge.Foro.Hub.domain.topicos;

public record DatosRespuestaTopico(
         Long id,
         String titulo,
         String mensaje,
         String fechaCreacion,
         String estado,
         String curso

) {
}
