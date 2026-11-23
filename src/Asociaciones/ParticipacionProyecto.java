package Asociaciones;

import Modelo.Investigador;
import Modelo.Proyecto;

public class ParticipacionProyecto {

    private Investigador investigador;
    private Proyecto proyecto;
    private String rol;
    private double porcentajeDedicacion;

    public ParticipacionProyecto(Investigador investigador,
                                 Proyecto proyecto,
                                 String rol,
                                 double porcentajeDedicacion) {
        this.investigador = investigador;
        this.proyecto = proyecto;
        this.rol = rol;
        this.porcentajeDedicacion = porcentajeDedicacion;
    }

    public Investigador getInvestigador() {
        return investigador;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public double getPorcentajeDedicacion() {
        return porcentajeDedicacion;
    }

    public void setPorcentajeDedicacion(double porcentajeDedicacion) {
        this.porcentajeDedicacion = porcentajeDedicacion;
    }

    @Override
    public String toString() {
        return "ParticipacionProyecto{" +
                "investigador=" + investigador.getNombre() +
                ", proyecto=" + proyecto.getTitulo() +
                ", rol='" + rol + '\'' +
                ", porcentajeDedicacion=" + porcentajeDedicacion +
                "%}";
    }
}
