package App;

import Modelo.Universidad;
import Modelo.Investigador;
import Modelo.GrupoInvestigacion;
import Modelo.LineaInvestigacion;
import Modelo.Proyecto;
import Modelo.InstitucionColaboradora;
import Modelo.Publicacion;
import Modelo.TrabajoFormacion;
import Modelo.DireccionFormacion;

import Asociaciones.ParticipacionGrupo;
import Asociaciones.ParticipacionProyecto;
import Asociaciones.AutorPublicacion;

import Servicios.ServicioInvestigacion;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Creamos la universidad y el servicio que permite gestionar la información.
        Universidad universidad = new Universidad(
                1,
                "Universidad de Cartagena",
                "Cartagena, Colombia"
        );

        ServicioInvestigacion servicio = new ServicioInvestigacion(universidad);

        System.out.println("SISTEMA DE INVESTIGACION CIENTIFICA");

        // Registramos algunos investigadores y asignamos sus especialidades.
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

        servicio.registrarInvestigador(investigador1);
        servicio.registrarInvestigador(investigador2);

        System.out.println("\nInvestigadores registrados:");

        for (Investigador investigador : universidad.getInvestigadores()) {
            System.out.println(investigador);
        }

        // Creamos un grupo de investigación y registramos la participación de un investigador.
        GrupoInvestigacion grupo = new GrupoInvestigacion(
                401,
                "Grupo de Inteligencia Artificial",
                "Investigacion y desarrollo de soluciones tecnologicas."
        );

        ParticipacionGrupo participacionGrupo = new ParticipacionGrupo(
                investigador1,
                grupo,
                "Lider de investigacion",
                LocalDate.now(),
                "Activo"
        );

        System.out.println("\nGrupo de investigacion:");
        System.out.println(grupo.getNombre());
        System.out.println("Participacion:");
        System.out.println(participacionGrupo);

        // Agregamos dos sublíneas a una línea principal de investigación.
        LineaInvestigacion lineaPrincipal = new LineaInvestigacion(
                501,
                "Inteligencia Artificial",
                "Estudio de tecnologias inteligentes."
        );

        LineaInvestigacion sublinea1 = new LineaInvestigacion(
                502,
                "Aprendizaje Automatico",
                "Investigacion sobre algoritmos de aprendizaje."
        );

        LineaInvestigacion sublinea2 = new LineaInvestigacion(
                503,
                "Procesamiento del Lenguaje Natural",
                "Estudio del lenguaje humano mediante sistemas inteligentes."
        );

        lineaPrincipal.agregarSublinea(sublinea1);
        lineaPrincipal.agregarSublinea(sublinea2);

        System.out.println("\nLineas de investigacion:");
        System.out.println(lineaPrincipal.getNombre());

        for (LineaInvestigacion sublinea : lineaPrincipal.getSublineas()) {
            System.out.println("- " + sublinea.getNombre());
        }

        // Registramos un proyecto de investigación.
        Proyecto proyecto1 = new Proyecto(
                201,
                "Inteligencia Artificial aplicada a la educacion",
                "Investigacion sobre el uso de IA en procesos educativos.",
                LocalDate.now(),
                null,
                "En desarrollo"
        );

        boolean proyectoRegistrado = servicio.registrarProyecto(proyecto1);

        System.out.println("\nRegistro de proyectos:");
        System.out.println("Proyecto registrado: " + proyectoRegistrado);

        // Relacionamos el proyecto con las instituciones que colaboran en su desarrollo.
        InstitucionColaboradora institucion1 = new InstitucionColaboradora(
                701,
                "Universidad Nacional",
                "Universidad",
                "Bogota, Colombia",
                "contacto@unal.edu.co"
        );

        InstitucionColaboradora institucion2 = new InstitucionColaboradora(
                702,
                "Centro de Investigacion Tecnologica",
                "Centro de investigacion",
                "Cartagena, Colombia",
                "contacto@centroinvestigacion.edu.co"
        );

        proyecto1.agregarInstitucion(institucion1);
        proyecto1.agregarInstitucion(institucion2);

        System.out.println("\nInstituciones del proyecto:");

        for (InstitucionColaboradora institucion : proyecto1.getInstituciones()) {
            System.out.println(institucion.getNombre());
        }

        System.out.println("\nProyectos de la institucion:");

        for (Proyecto proyecto : institucion1.getProyectos()) {
            System.out.println(proyecto.getTitulo());
        }

        // Registramos la participación de un investigador dentro del proyecto.
        ParticipacionProyecto participacionProyecto = new ParticipacionProyecto(
                investigador1,
                proyecto1,
                "Investigador principal",
                50.0
        );

        System.out.println("\nParticipacion en el proyecto:");
        System.out.println("Rol: " + participacionProyecto.getRol());
        System.out.println("Dedicacion: "
                + participacionProyecto.getPorcentajeDedicacion() + "%");
        System.out.println("Dedicacion valida: "
                + participacionProyecto.validarDedicacion());

        // Creamos una publicación científica y la registramos en el sistema.
        Publicacion publicacion1 = new Publicacion(
                301,
                "El impacto de la inteligencia artificial en la educacion",
                "Articulo cientifico",
                "Revista academica",
                LocalDate.now(),
                "10.1234/ejemplo.2026"
        );

        boolean publicacionRegistrada = servicio.registrarPublicacion(publicacion1);

        System.out.println("\nPublicaciones:");
        System.out.println("Publicacion registrada: " + publicacionRegistrada);

        // Asociamos los investigadores con la publicación y establecemos el orden de autoría.
        AutorPublicacion autor1 = new AutorPublicacion(
                investigador1,
                publicacion1,
                1,
                "Autor principal"
        );

        AutorPublicacion autor2 = new AutorPublicacion(
                investigador2,
                publicacion1,
                2,
                "Coautor"
        );

        System.out.println("\nAutores de la publicacion:");
        System.out.println(autor1);
        System.out.println(autor2);

        // Creamos un trabajo de formación y asignamos un director al investigador.
        TrabajoFormacion trabajo = new TrabajoFormacion(
                601,
                "Desarrollo de un sistema educativo con IA",
                "Trabajo de investigacion",
                "Estudio de herramientas inteligentes aplicadas a la educacion.",
                LocalDate.now(),
                null,
                "En desarrollo"
        );

        DireccionFormacion direccion = new DireccionFormacion(
                investigador1,
                investigador2,
                trabajo,
                LocalDate.now(),
                "Seguimiento inicial del trabajo."
        );

        System.out.println("\nTrabajo de formacion:");
        System.out.println(trabajo.getTitulo());
        System.out.println("Direccion registrada:");
        System.out.println(direccion);

        // Consultamos los registros para comprobar que se encuentren en el sistema.
        System.out.println("\nConsultas del sistema:");

        Investigador investigadorEncontrado = servicio.buscarInvestigador(101);

        if (investigadorEncontrado != null) {
            System.out.println("Investigador encontrado: " + investigadorEncontrado);
        } else {
            System.out.println("No se encontro el investigador.");
        }

        Proyecto proyectoEncontrado = servicio.buscarProyecto(201);

        if (proyectoEncontrado != null) {
            System.out.println("Proyecto encontrado: " + proyectoEncontrado);
        } else {
            System.out.println("No se encontro el proyecto.");
        }

        Publicacion publicacionEncontrada = servicio.buscarPublicacion(301);

        if (publicacionEncontrada != null) {
            System.out.println("Publicacion encontrada: " + publicacionEncontrada);
        } else {
            System.out.println("No se encontro la publicacion.");
        }

        // Intentamos registrar otro proyecto con un identificador que ya existe.
        Proyecto proyectoDuplicado = new Proyecto(
                201,
                "Proyecto duplicado",
                "Prueba para evitar registros repetidos.",
                LocalDate.now(),
                null,
                "Pendiente"
        );

        System.out.println("\nValidacion de registros:");
        System.out.println("Registro de proyecto duplicado: "
                + servicio.registrarProyecto(proyectoDuplicado));

        // Eliminamos un investigador y mostramos los que permanecen registrados.
        System.out.println("\nInvestigadores despues de la eliminacion:");

        universidad.eliminarInvestigador(102);

        for (Investigador investigador : universidad.getInvestigadores()) {
            System.out.println(investigador);
        }

        // Mostramos un pequeño resumen de los datos que quedaron registrados.
        System.out.println("\nResumen del sistema:");
        System.out.println("Universidad: " + universidad.getNombre());
        System.out.println("Total de investigadores: "
                + universidad.getInvestigadores().size());
        System.out.println("Proyecto consultado: "
                + (proyectoEncontrado != null ? "Si" : "No"));
        System.out.println("Publicacion consultada: "
                + (publicacionEncontrada != null ? "Si" : "No"));

        System.out.println("\nEl programa ha finalizado correctamente.");
    }
}
