package entidades;

import java.util.Scanner;

public class Menu {

    public void menu(){

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Series series = new Series();
        boolean fin = false;
        String opcion = "";

        while (!fin){
            System.out.println("\n" + "- Sistema de carga de series - " + "\n" +
                    "Ingrese una opcion para iniciar" + "\n" +
                    "1) Añadir una serie a la lista" + "\n" +
                    "2) Ver la lista actual" + "\n" +
                    "3) Ver la lista de series que duran menos de 15 minutos" + "\n" +
                    "4) Ver la lista de series que duran mas de 40 minutos" + "\n" +
                    "5) Ver las series cargadas de categoria ROMANCE" + "\n" +
                    "6) Ver las series cargadas de categoria COMEDIA" + "\n" +
                    "7) Ver las series cargadas de categoria DRAMA" + "\n" +
                    "8) Salir del sistema." + "\n" +
                    "Seleccione una de las opciones anteriores:");

            opcion = input.next();

            switch (opcion){
                case "1":
                    System.out.println("\n" + "Agregar serie:");
                    series.crearSerie();
                    break;

                case "2":
                    series.verLista();
                    break;

                case "3":
                    System.out.println("\n" + "Series que duran menos de 15 minutos:");
                    series.menos15M();
                    break;

                case "4":
                    System.out.println("\n" + "Series que duran mas de 40 minutos:");
                    series.mas40M();
                    break;

                case "5":
                    System.out.println("\n" + "Series de categoria ROMANCE");
                    series.verRomance();
                    break;

                case "6":
                    System.out.println("\n" + "Series de categoria COMEDIA");
                    series.verComedia();
                    break;

                case "7":
                    System.out.println("\n" + "Series de categoria DRAMA");
                    series.verDrama();
                    break;

                case "8":
                    System.out.println("Fin del proceso.");
                    fin = true;
                    break;

                default:
                    System.out.println("Por favor ingrese una opcion valida");
            }
        }
    }
}
