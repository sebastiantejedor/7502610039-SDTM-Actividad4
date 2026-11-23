
package App;


import Modelo.Universidad;
import Modelo.Investigador;
import Modelo.Proyecto;
import Modelo.Publicacion;
import Servicios.ServicioInvestigacion;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("SISTEMA DE INVESTIGACION CIENTIFICA");
        System.out.println("Universidad de Cartagena\n");

        Universidad universidad = new Universidad(
                1,
                "Universidad de Cartagena",
                "Cartagena, Colombia"
        );

        ServicioInvestigacion servicio =
                new ServicioInvestigacion(universidad);

        System.out.println("Informacion de la universidad:");
        System.out.println(universidad);

        // Registro de investigadores
        System.out.println("\nRegistro de investigadores:");

        Investigador investigador1 = new Investigador(
                101,
                "Sebastian Tejedor Montiel",
                "sebaspolar982@gmail.com"
        );

        Investigador investigador2 = new Investigador(
                102,
                "Santiago Tejedor Montiel",
                "santiagotm0311@gmail.com"
        );

        investigador1.actualizarEspecialidad("Inteligencia Artificial");
        investigador2.actualizarEspecialidad("Desarrollo de Software");

        System.out.println("Sebastian registrado: "
                + servicio.registrarInvestigador(investigador1));

        System.out.println("Santiago registrado: "
                + servicio.registrarInvestigador(investigador2));

        // Consulta de investigadores
        System.out.println("\nInvestigadores registrados:");

        for (Investigador investigador : universidad.getInvestigadores()) {
            System.out.println(investigador);
        }

        // Busqueda de un investigador
        System.out.println("\nBusqueda de investigador:");

        Investigador encontrado = servicio.buscarInvestigador(101);

        if (encontrado != null) {
            System.out.println("Investigador encontrado: " + encontrado);
        } else {
            System.out.println("No se encontro el investigador.");
        }

        // Eliminacion de un investigador
        System.out.println("\nEliminacion de investigador:");

        boolean eliminado = universidad.eliminarInvestigador(102);

        System.out.println("Eliminacion exitosa: " + eliminado);

        System.out.println("\nLista actualizada:");

        for (Investigador investigador : universidad.getInvestigadores()) {
            System.out.println(investigador);
        }

        // Registro de proyectos
        System.out.println("\nRegistro de proyectos:");

        Proyecto proyecto1 = new Proyecto(
                201,
                "Inteligencia Artificial aplicada a la educacion",
                "Investigacion sobre el uso de IA en procesos educativos.",
                LocalDate.now(),
                null,
                "En desarrollo"
        );

        System.out.println("Proyecto registrado: "
                + servicio.registrarProyecto(proyecto1));

        // Busqueda de proyectos
        System.out.println("\nBusqueda de proyectos:");

        Proyecto proyectoEncontrado = servicio.buscarProyecto(201);

        if (proyectoEncontrado != null) {
            System.out.println(proyectoEncontrado);
        } else {
            System.out.println("No se encontro el proyecto.");
        }

        // Registro de publicaciones
        System.out.println("\nRegistro de publicaciones:");

        Publicacion publicacion1 = new Publicacion(
                301,
                "El impacto de la inteligencia artificial en la educacion",
                "Articulo cientifico",
                "Revista universitaria",
                LocalDate.now(),
                "10.1234/ejemplo.2026"
        );

        System.out.println("Publicacion registrada: "
                + servicio.registrarPublicacion(publicacion1));

        // Busqueda de publicaciones
        System.out.println("\nBusqueda de publicaciones:");

        Publicacion publicacionEncontrada =
                servicio.buscarPublicacion(301);

        if (publicacionEncontrada != null) {
            System.out.println(publicacionEncontrada);
        } else {
            System.out.println("No se encontro la publicacion.");
        }

        // Prueba de registros duplicados
        System.out.println("\nComprobacion de registros duplicados:");

        Proyecto proyectoDuplicado = new Proyecto(
                201,
                "Proyecto duplicado",
                "Prueba de identificador repetido.",
                LocalDate.now(),
                null,
                "Pendiente"
        );

        System.out.println("Registro de proyecto duplicado: "
                + servicio.registrarProyecto(proyectoDuplicado));

        System.out.println("\nResumen:");

        System.out.println("Universidad: " + universidad.getNombre());
        System.out.println("Investigadores actuales: "
                + universidad.getInvestigadores().size());

        System.out.println("\nEjecucion del sistema finalizada.");
    }
}
