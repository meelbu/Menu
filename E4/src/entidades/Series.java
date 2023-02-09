package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Series {

    private String categoria;
    private int duracion;
    private String nombre;

    private ArrayList<Series> listaSeries;

    public Series() {
        this.listaSeries = new ArrayList<>();
    }

    public Series(String categoria, int duracion, String nombre) {
        this.categoria = categoria;
        this.duracion = duracion;
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Series> getListaSeries() {
        return listaSeries;
    }

    public void setListaSeries(ArrayList<Series> listaSeries) {
        this.listaSeries = listaSeries;
    }

    public void crearSerie() {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Series series = new Series();

        System.out.println("Ingrese el nombre de la serie:");
        nombre = input.next();
        series.setNombre(nombre);

        System.out.println("Ingrese la categoria:");
        categoria = input.next();
        series.setCategoria(categoria);

        System.out.println("Ingrese la duracion en minutos:");
        duracion = input.nextInt();
        series.setDuracion(duracion);

        añadirSerie(series);
    }

    public void añadirSerie(Series series) {
        this.listaSeries.add(series);
    }

    public void verLista() {
        System.out.println("\n" + "Lista de series cargadas:" + "\n");
        for (Series i : listaSeries) {
            System.out.println(i);
        }
    }

    public void menos15M() {
        for (Series i : listaSeries) {
            if (i.getDuracion() <= 15) {
                System.out.println(i);
            }
        }
    }

    public void mas40M() {
        for (Series i : listaSeries) {
            if (i.getDuracion() >= 40) {
                System.out.println(i);
            }
        }
    }

    public void verRomance() {
        for (Series i : listaSeries) {
            if (i.getCategoria().equalsIgnoreCase("romance")) {
                System.out.println(i);
            }
        }
    }



    public void verComedia() {
        for (Series i : listaSeries) {
            if (i.getCategoria().equalsIgnoreCase("comedia")) {
                System.out.println(i);
            }
        }

    }

    public void verDrama(){
        for (Series i : listaSeries) {
            if (i.getCategoria().equalsIgnoreCase("drama")){
                System.out.println(i);
            }
        }
    }

    @Override
    public String toString() {
        return
                "Nombre:" + nombre  + "\n" +
                        "Categoria:" + categoria + "\n" +
                "Duracion:" + duracion + "\n";
    }
}
