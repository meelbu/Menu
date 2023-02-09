package entidades;

import java.util.Scanner;

public class Menu{

public void menu(){

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    Libro libro = new Libro();
    boolean salir = false;
    String opcion = "";

    while (!salir) {
        System.out.println("\n" + "Carga a biblioteca" + "\n" +
                "-------------------------" + "\n" +
                "- 1) Agregar un libro a la lista de biblioteca" + "\n" +
                "- 2) Ver la lista de libros cargados" + "\n" +
                "- 3) Ver la lista de libros con mas de 300 páginas" + "\n" +
                "- 4) Ver la lista de libros con menos de 150 npáginas" + "\n" +
                "- 5) Salir del sistema." + "\n" +
                "A continunacion seleccione una opcion:");

        opcion = input.next();

        switch (opcion){
            case "1":
                System.out.println("\n"+ "Agregar libro:");
                libro.crearLibro();
                break;

            case "2":
                libro.verLista();
                break;

            case "3":
                System.out.println("\n" + "Libros con mas de 300 páginas");
                libro.mas300Pag();
                break;

            case "4":
                System.out.println("\n" + "Libros con menos de 150 páginas");
                libro.menos150Pag();
                break;

            case "5":
                System.out.println("Fin del proceso.");
                salir = true;
                break;

            default:
                System.out.println("Ingrese una opcion válida");
        }
    }
}
}
