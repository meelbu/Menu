package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Automoviles {

    private String marca;
    private int stock;

    private ArrayList<Automoviles> listaautomoviles;

    public Automoviles(){
        this.listaautomoviles = new ArrayList<>();
    }

    public Automoviles(String marca, int stock) {
        this.marca = marca;
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Automoviles> getListamoviles() {
        return listaautomoviles;
    }

    public void setListaautomoviles(ArrayList<Automoviles> listaautomoviles) {
        this.listaautomoviles = listaautomoviles;
    }

    public void crearCarga(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Automoviles automoviles = new Automoviles();

        System.out.println("Ingrese la marca del automovil:");
        marca = input.next();
        automoviles.setMarca(marca);

        System.out.println("Ingrese el stock actual");
        stock = input.nextInt();
        automoviles.setStock(stock);

        añadirDatos(automoviles);
    }

    public void añadirDatos(Automoviles automoviles){

        this.listaautomoviles.add(automoviles);
    }

    public void listaExistente(){
        System.out.println("\n" + "Lista de la carga");
        for (Automoviles a: listaautomoviles) {
            System.out.println(a);
        }
    }

    public void StockMenor3(){
        for (Automoviles i : listaautomoviles) {
            if (i.getStock() <=3){
                System.out.println("\n" + "Lista de marcas con menor stock : ");
                System.out.println(i);
            }
        }

    }

    public void StockMayor10(){
        for (Automoviles i : listaautomoviles) {
            if (i.getStock() >= 10){
                System.out.println("\n" + "Lista de marcas con mayor stock");
                System.out.println(i);
            }
        }
    }

    @Override
    public String toString() {
        return  "\n" +
                "Marca:" + marca + "\n" +
                "Stock:" + stock;
    }
}
