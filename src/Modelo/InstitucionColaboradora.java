package Modelo;

public class InstitucionColaboradora {

    private int id;
    private String nombre;
    private String tipo;
    private String direccion;
    private String correoContacto;

    public InstitucionColaboradora(int id, String nombre, String tipo,
                                   String direccion, String correoContacto) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
        this.correoContacto = correoContacto;
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
