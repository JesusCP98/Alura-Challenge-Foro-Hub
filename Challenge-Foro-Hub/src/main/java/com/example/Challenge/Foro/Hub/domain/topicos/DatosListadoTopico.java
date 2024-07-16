package com.example.Challenge.Foro.Hub.domain.topicos;

public record DatosListadoTopico(String titulo, String mensaje, Boolean estado, String curso) {

    public DatosListadoTopico(Topico topico){
        this(topico.getTitulo(), topico.getMensaje(), topico.isEstado(), topico.getCurso());
    }
}
