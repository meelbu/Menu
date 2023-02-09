package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Mascota {

    private String nombre;
    private String tipo;
    private int edad;

    private ArrayList<Mascota> listaMascotas;

    public Mascota(){
        this.listaMascotas = new ArrayList<>();
    }

    public Mascota(String nombre, String tipo, int edad, ArrayList<Mascota> listaMascotas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.listaMascotas = listaMascotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public  void crearMascota(){
        Mascota mascota = new Mascota();
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el nombre");
        nombre= input.next();
        mascota.setNombre(nombre);

        System.out.println("Ingrese la edad");
        edad= input.nextInt();
        mascota.setEdad(edad);

        System.out.println("Ingrese el tipo de mascota");
        tipo= input.next();
        mascota.setTipo(tipo);

        añadirMascota(mascota);

    }

    public void añadirMascota(Mascota mascota){
        this.listaMascotas.add(mascota);
    }

    public void verListado(){
        for (Mascota masc : listaMascotas) {
            System.out.println(masc);
        }
    }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre + "\n" +
                ", Tipo:" + tipo + "\n" +
                ", Edad:" + edad + "\n";
    }
}
