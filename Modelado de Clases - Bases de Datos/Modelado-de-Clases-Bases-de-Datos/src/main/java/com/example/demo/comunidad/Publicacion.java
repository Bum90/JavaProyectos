package com.example.demo.comunidad;

import java.time.LocalDateTime;

public class Publicacion {
    private int idPublicacion;
    private String contenido;
    private LocalDateTime fechaPublicacion;
    private Usuario autorDePost;

    public Publicacion(int idPublicacion, String contenido, LocalDateTime fechaPublicacion, Usuario autorDePost) {
        this.idPublicacion = idPublicacion;
        this.contenido = contenido;
        this.fechaPublicacion = fechaPublicacion;
        this.autorDePost = autorDePost;
    }

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Usuario getAutorDePost() {
        return autorDePost;
    }

    public void setAutorDePost(Usuario autorDePost) {
        this.autorDePost = autorDePost;
    }
}
