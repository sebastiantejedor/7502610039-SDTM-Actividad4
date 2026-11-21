package Modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Universidad {

    private int id;
    private String nombre;
    private String direccion;
    private List<Investigador> investigadores;

    public Universidad(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.investigadores = new ArrayList<>();
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Investigador> getInvestigadores() {
        return Collections.unmodifiableList(investigadores);
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
