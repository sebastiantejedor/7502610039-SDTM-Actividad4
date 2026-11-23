package Modelo;

import java.time.LocalDate;

public class Publicacion {

    private int id;
    private String titulo;
    private String tipo;
    private String medioPublicacion;
    private LocalDate fechaPublicacion;
    private String doi;

    public Publicacion(int id, String titulo, String tipo,
                       String medioPublicacion, LocalDate fechaPublicacion,
                       String doi) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.medioPublicacion = medioPublicacion;
        this.fechaPublicacion = fechaPublicacion;
        this.doi = doi;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMedioPublicacion() {
        return medioPublicacion;
    }

    public void setMedioPublicacion(String medioPublicacion) {
        this.medioPublicacion = medioPublicacion;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", medioPublicacion='" + medioPublicacion + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                ", doi='" + doi + '\'' +
                '}';
    }
}
