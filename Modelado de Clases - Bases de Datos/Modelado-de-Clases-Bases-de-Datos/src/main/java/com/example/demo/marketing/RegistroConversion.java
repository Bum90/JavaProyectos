package com.example.demo.marketing;

import java.time.LocalDateTime;

public class RegistroConversion {
    private int idConversion;
    private String tipoConversion;
    private double valor;
    private LocalDateTime fechaConversion;
    private Campana campana;
    private Plataforma plataforma;

    public RegistroConversion(int idConversion, String tipoConversion, double valor, LocalDateTime fechaConversion, Campana campana, Plataforma plataforma) {
        this.idConversion = idConversion;
        this.tipoConversion = tipoConversion;
        this.valor = valor;
        this.fechaConversion = fechaConversion;
        this.campana = campana;
        this.plataforma = plataforma;
    }

    public int getIdConversion() {
        return idConversion;
    }

    public void setIdConversion(int idConversion) {
        this.idConversion = idConversion;
    }

    public String getTipoConversion() {
        return tipoConversion;
    }

    public void setTipoConversion(String tipoConversion) {
        this.tipoConversion = tipoConversion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getFechaConversion() {
        return fechaConversion;
    }

    public void setFechaConversion(LocalDateTime fechaConversion) {
        this.fechaConversion = fechaConversion;
    }

    public Campana getCampana() {
        return campana;
    }

    public void setCampana(Campana campana) {
        this.campana = campana;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }
}
