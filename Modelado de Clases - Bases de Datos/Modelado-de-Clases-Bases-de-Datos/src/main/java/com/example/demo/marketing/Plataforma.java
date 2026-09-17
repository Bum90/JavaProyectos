package com.example.demo.marketing;

public class Plataforma {
    private int idPlataforma;
    private String nombrePlataforma;
    private String urlPlataforma;

    public Plataforma(int idPlataforma, String nombrePlataforma, String urlPlataforma) {
        this.idPlataforma = idPlataforma;
        this.nombrePlataforma = nombrePlataforma;
        this.urlPlataforma = urlPlataforma;
    }

    public int getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(int idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public String getNombrePlataforma() {
        return nombrePlataforma;
    }

    public void setNombrePlataforma(String nombrePlataforma) {
        this.nombrePlataforma = nombrePlataforma;
    }

    public String getUrlPlataforma() {
        return urlPlataforma;
    }

    public void setUrlPlataforma(String urlPlataforma) {
        this.urlPlataforma = urlPlataforma;
    }
}
