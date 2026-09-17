package com.example.demo.comunidad;

import java.time.LocalDate;

public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private LocalDate fechaRegistro;

    public Usuario(String nombreUsuario, int idUsuario, LocalDate fechaRegistro) {
        this.nombreUsuario = nombreUsuario;
        this.idUsuario = idUsuario;
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
