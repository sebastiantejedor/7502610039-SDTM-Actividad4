package Asociaciones;

import Modelo.GrupoInvestigacion;
import Modelo.Investigador;

import java.time.LocalDate;

public class ParticipacionGrupo {

    private Investigador investigador;
    private GrupoInvestigacion grupo;
    private String rol;
    private LocalDate fechaIngreso;
    private String estado;

    public ParticipacionGrupo(Investigador investigador,
                              GrupoInvestigacion grupo,
                              String rol,
                              LocalDate fechaIngreso,
                              String estado) {

        this.investigador = investigador;
        this.grupo = grupo;
        this.rol = rol;
        this.fechaIngreso = fechaIngreso;
        this.estado = estado;
    }

    public Investigador getInvestigador() {
        return investigador;
    }

    public GrupoInvestigacion getGrupo() {
        return grupo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ParticipacionGrupo{" +
                "investigador=" + investigador.getNombre() +
                ", grupo=" + grupo.getNombre() +
                ", rol='" + rol + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", estado='" + estado + '\'' +
                '}';
    }
}
