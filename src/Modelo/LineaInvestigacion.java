package Modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LineaInvestigacion {

    private int id;
    private String nombre;
    private String descripcion;
    private LineaInvestigacion lineaPadre;
    private List<LineaInvestigacion> sublineas;

    public LineaInvestigacion(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.lineaPadre = null;
        this.sublineas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LineaInvestigacion getLineaPadre() {
        return lineaPadre;
    }

    public List<LineaInvestigacion> getSublineas() {
        return Collections.unmodifiableList(sublineas);
    }

    public void agregarSublinea(LineaInvestigacion sublinea) {
        if (sublinea == null || sublinea == this
                || sublinea.lineaPadre != null
                || sublineas.contains(sublinea)) {
            return;
        }

        sublineas.add(sublinea);
        sublinea.lineaPadre = this;
    }

    @Override
    public String toString() {
        return "LineaInvestigacion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
