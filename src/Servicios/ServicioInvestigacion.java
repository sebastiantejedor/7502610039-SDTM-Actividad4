package Servicios;

import Modelo.Investigador;
import Modelo.Proyecto;
import Modelo.Publicacion;
import Modelo.Universidad;

import java.util.ArrayList;
import java.util.List;

public class ServicioInvestigacion implements IGestionInvestigacion {

    private Universidad universidad;
    private List<Proyecto> proyectos;
    private List<Publicacion> publicaciones;

    public ServicioInvestigacion(Universidad universidad) {
        this.universidad = universidad;
        this.proyectos = new ArrayList<>();
        this.publicaciones = new ArrayList<>();
    }

    @Override
    public boolean registrarInvestigador(Investigador investigador) {
        if (investigador == null) {
            return false;
        }

        try {
            universidad.registrarInvestigador(investigador);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    @Override
    public Investigador buscarInvestigador(int id) {
        return universidad.buscarInvestigadorPorId(id);
    }

    @Override
    public boolean registrarProyecto(Proyecto proyecto) {
        if (proyecto == null || buscarProyecto(proyecto.getId()) != null) {
            return false;
        }

        proyectos.add(proyecto);
        return true;
    }

    @Override
    public Proyecto buscarProyecto(int id) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getId() == id) {
                return proyecto;
            }
        }

        return null;
    }

    @Override
    public boolean registrarPublicacion(Publicacion publicacion) {
        if (publicacion == null || buscarPublicacion(publicacion.getId()) != null) {
            return false;
        }

        publicaciones.add(publicacion);
        return true;
    }

    @Override
    public Publicacion buscarPublicacion(int id) {
        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getId() == id) {
                return publicacion;
            }
        }

        return null;
    }
}
