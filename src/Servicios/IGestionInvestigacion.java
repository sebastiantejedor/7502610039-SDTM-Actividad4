package Servicios;

import Modelo.Investigador;
import Modelo.Proyecto;
import Modelo.Publicacion;

public interface IGestionInvestigacion {

    boolean registrarInvestigador(Investigador investigador);

    Investigador buscarInvestigador(int id);

    boolean registrarProyecto(Proyecto proyecto);

    Proyecto buscarProyecto(int id);

    boolean registrarPublicacion(Publicacion publicacion);

    Publicacion buscarPublicacion(int id);
}
