package Modelo;

import java.time.LocalDate;

public class DireccionFormacion {

    private Investigador director;
    private Investigador investigadorDirigido;
    private TrabajoFormacion trabajo;
    private LocalDate fechaAsignacion;
    private String observaciones;

    public DireccionFormacion(Investigador director,
                              Investigador investigadorDirigido,
                              TrabajoFormacion trabajo,
                              LocalDate fechaAsignacion,
                              String observaciones) {
        this.director = director;
        this.investigadorDirigido = investigadorDirigido;
        this.trabajo = trabajo;
        this.fechaAsignacion = fechaAsignacion;
        this.observaciones = observaciones;
    }

    public Investigador getDirector() {
        return director;
    }

    public Investigador getInvestigadorDirigido() {
        return investigadorDirigido;
    }

    public TrabajoFormacion getTrabajo() {
        return trabajo;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "DireccionFormacion{" +
                "director=" + director.getNombre() +
                ", investigadorDirigido=" + investigadorDirigido.getNombre() +
                ", trabajo=" + trabajo.getTitulo() +
                ", fechaAsignacion=" + fechaAsignacion +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}
