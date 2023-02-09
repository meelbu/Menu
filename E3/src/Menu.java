import entidades.Automoviles;

import java.util.Scanner;

public class Menu {

    public void menu() {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Automoviles automoviles = new Automoviles();
        boolean salir = false;
        String opcion = "";

        while (!salir) {

            System.out.println("\n" + "--- Sistema de carga - Concesionaria S.A ---" + "\n"
                    + "Ingrese una opcion para continuar: " + "\n" +
                    "- 1. Agregar Stock." + "\n" +
                    "- 2. Listar el stock existente." + "\n" +
                    "- 3. Listar el stock menor a 3 disponible." + "\n " +
                    "- 4. Listar el stock mayor a 10 disponible" + "\n" +
                    "- 5. Cerrar del sistema." + "\n" +
                    "Selección: ");

            opcion = input.next();

            switch (opcion) {
                case "1":
                    System.out.println("\n" + "Agregar stock");
                    automoviles.crearCarga();
                    break;

                case "2":
                    automoviles.listaExistente();
                    break;

                case "3":
                    automoviles.StockMenor3();
                    break;

                case "4":
                    automoviles.StockMayor10();
                    break;

                case "5":

                    System.out.println("Fin del proceso.");
                    salir = true;

                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
            }

        }

    }
}
