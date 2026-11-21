package Modelo;

public class Investigador {

    private int id;
    private String nombre;
    private String correo;
    private String especialidad;
    private Universidad universidad;

    public Investigador(int id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.especialidad = "Sin especificar";
        this.universidad = null;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void actualizarEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    void asignarUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    void retirarUniversidad() {
        this.universidad = null;
    }

    @Override
    public String toString() {
        return "Investigador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}

