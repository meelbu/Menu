package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Libro {

    private String titulo;
    private String autor;
    private  int numPag;

    private ArrayList<Libro> listaLibros;

    public Libro(){
        this.listaLibros = new ArrayList<>();
    }

    public Libro(String titulo, String autor, int numPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void crearLibro(){
        Libro libro = new Libro();
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el nombre del libro");
        titulo = input.next();
        libro.setTitulo(titulo);

        System.out.println("Ingrese el autor");
        autor = input.next();
        libro.setAutor(autor);

        System.out.println("Ingrese la cantidad de paginas");
        numPag = input.nextInt();
        libro.setNumPag(numPag);

        añadirLibro(libro);

    }

    public void añadirLibro(Libro libro){
        this.listaLibros.add(libro);
    }

    public void verLista(){
        System.out.println("\n" + "Lista de libros en la biblioteca" + "\n" +
         "---------------------------" + "\n");
        for (Libro i: listaLibros) {
            System.out.println(i);
        }
    }

    public void mas300Pag(){
        for (Libro i : listaLibros) {
            if (i.getNumPag()>= 300){
                System.out.println(i);
            }
        }
    }

    public void menos150Pag(){
        for (Libro i:listaLibros) {
            if (i.getNumPag() <= 150){
                System.out.println(i);
            }
        }
    }



    @Override
    public String toString() {
        return
                "Titulo:" + titulo + "\n" +
                "Autor:" + autor + "\n" +
                "Cantidad de páginas:" + numPag + "\n";
    }


}
