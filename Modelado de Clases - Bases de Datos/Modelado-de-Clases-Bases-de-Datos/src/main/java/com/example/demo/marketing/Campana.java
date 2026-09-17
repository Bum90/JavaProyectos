package com.example.demo.marketing;

import java.time.LocalDate;

public class Campana {
    private int idCampana;
    private String nombreCampana;
    private double presupuesto;
    private LocalDate fechaInicio;

    public Campana(LocalDate fechaInicio, int idCampana, String nombreCampana, double presupuesto) {
        this.fechaInicio = fechaInicio;
        this.idCampana = idCampana;
        this.nombreCampana = nombreCampana;
        this.presupuesto = presupuesto;
    }

    public int getIdCampana() {
        return idCampana;
    }

    public void setIdCampana(int idCampana) {
        this.idCampana = idCampana;
    }

    public String getNombreCampana() {
        return nombreCampana;
    }

    public void setNombreCampana(String nombreCampana) {
        this.nombreCampana = nombreCampana;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}