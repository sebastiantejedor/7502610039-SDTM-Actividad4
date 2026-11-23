package Modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstitucionColaboradora {

    private int id;
    private String nombre;
    private String tipo;
    private String direccion;
    private String correoContacto;
    private List<Proyecto> proyectos;

    public InstitucionColaboradora(int id, String nombre, String tipo,
                                   String direccion, String correoContacto) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
        this.correoContacto = correoContacto;
        this.proyectos = new ArrayList<>();
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }

    public List<Proyecto> getProyectos() {
        return Collections.unmodifiableList(proyectos);
    }

    public void agregarProyecto(Proyecto proyecto) {
        if (proyecto != null && !proyectos.contains(proyecto)) {
            proyectos.add(proyecto);
            proyecto.agregarInstitucion(this);
        }
    }


    @Override
    public String toString() {
        return "InstitucionColaboradora{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", correoContacto='" + correoContacto + '\'' +
                '}';
    }
}
