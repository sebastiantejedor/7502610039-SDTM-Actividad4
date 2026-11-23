package Asociaciones;

import Modelo.Investigador;
import Modelo.Publicacion;

public class AutorPublicacion {

    private Investigador investigador;
    private Publicacion publicacion;
    private int ordenAutor;
    private String tipoContribucion;

    public AutorPublicacion(Investigador investigador,
                            Publicacion publicacion,
                            int ordenAutor,
                            String tipoContribucion) {
        this.investigador = investigador;
        this.publicacion = publicacion;
        this.ordenAutor = ordenAutor;
        this.tipoContribucion = tipoContribucion;
    }

    public Investigador getInvestigador() {
        return investigador;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public int getOrdenAutor() {
        return ordenAutor;
    }

    public void setOrdenAutor(int ordenAutor) {
        this.ordenAutor = ordenAutor;
    }

    public String getTipoContribucion() {
        return tipoContribucion;
    }

    public void setTipoContribucion(String tipoContribucion) {
        this.tipoContribucion = tipoContribucion;
    }

    @Override
    public String toString() {
        return "AutorPublicacion{" +
                "investigador=" + investigador.getNombre() +
                ", publicacion='" + publicacion.getTitulo() + '\'' +
                ", ordenAutor=" + ordenAutor +
                ", tipoContribucion='" + tipoContribucion + '\'' +
                '}';
    }
}
