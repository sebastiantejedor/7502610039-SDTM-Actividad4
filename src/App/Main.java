package App;


import Modelo.Universidad;
import Modelo.Investigador;

public class Main {

    public static void main(String[] args) {

        Universidad universidad = new Universidad(
                1,
                "Universidad de Cartagena",
                "Cartagena, Colombia"
        );

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

        System.out.println("SISTEMA DE INVESTIGACIÓN CIENTÍFICA");

        System.out.println("\nInformación de la universidad: ");
        System.out.println(universidad);

        System.out.println("\nRegistro de investigadores:");

        System.out.println("Sebastian registrado: " +
                universidad.registrarInvestigador(investigador1));

        System.out.println("Santiago registrado: " +
                universidad.registrarInvestigador(investigador2));

        System.out.println("\nLista de investigadores: ");

        for (Investigador investigador : universidad.getInvestigadores()) {
            System.out.println(investigador);
        }

        System.out.println("\nBúsqueda de investigador: ");

        Investigador encontrado = universidad.buscarInvestigadorPorId(101);

        if (encontrado != null) {
            System.out.println("Investigador encontrado: " + encontrado);
        } else {
            System.out.println("Investigador no encontrado.");
        }

        System.out.println("\nEliminación de investigador: ");

        System.out.println("Eliminación exitosa: " +
                universidad.eliminarInvestigador(102));

        System.out.println("\nLista actualizada de investigadores: ");

        for (Investigador investigador : universidad.getInvestigadores()) {
            System.out.println(investigador);
        }
    }
}
