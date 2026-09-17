package com.example.demo.comunidad;

import java.time.LocalDateTime;

public class Reaccion {
    private int idReaccion;
    private String tipoReaccion;
    private LocalDateTime fechaReaccion;
    private Usuario usuarioQueReacciona;
    private Publicacion publicacion;

    public Reaccion(int idReaccion, String tipoReaccion, LocalDateTime fechaReaccion, Usuario usuarioQueReacciona, Publicacion publicacion) {
        this.idReaccion = idReaccion;
        this.tipoReaccion = tipoReaccion;
        this.fechaReaccion = fechaReaccion;
        this.usuarioQueReacciona = usuarioQueReacciona;
        this.publicacion = publicacion;
    }

    public int getIdReaccion() {
        return idReaccion;
    }

    public void setIdReaccion(int idReaccion) {
        this.idReaccion = idReaccion;
    }

    public String getTipoReaccion() {
        return tipoReaccion;
    }

    public void setTipoReaccion(String tipoReaccion) {
        this.tipoReaccion = tipoReaccion;
    }

    public LocalDateTime getFechaReaccion() {
        return fechaReaccion;
    }

    public void setFechaReaccion(LocalDateTime fechaReaccion) {
        this.fechaReaccion = fechaReaccion;
    }

    public Usuario getUsuarioQueReacciona() {
        return usuarioQueReacciona;
    }

    public void setUsuarioQueReacciona(Usuario usuarioQueReacciona) {
        this.usuarioQueReacciona = usuarioQueReacciona;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
}
