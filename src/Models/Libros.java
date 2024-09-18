package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Libros {
    List<Libro> libros;

    Scanner ingreso = new Scanner(System.in);

    public Libros() {
        this.libros = new ArrayList<>();
    }

    public Libros(int size) {
        this.libros = new ArrayList<>(size);
    }

    public void add(Libro libro) {
        libros.add(libro);
    }

    public Libro agregarLibro() {
        Libro a = new Libro();

        System.out.println("Ingrese el titulo");
        a.setTitulo(ingreso.nextLine());
        System.out.println("Ingrese el Autor");
        a.setAutor(ingreso.nextLine());
        System.out.println("Ingrese el precio");
        a.setPrecio(ingreso.nextDouble());
        System.out.println("Ingrese el año del Libro");
        a.setPrecio(ingreso.nextInt());
        libros.add(a);
        return a;
    }

    public boolean buscarLibroTitulo(String titulo) {
        boolean found = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                found = true;
                System.out.println(libro.toString());
            }
        }

        return found;
    }

    public boolean eliminarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                libros.remove(libro);
                return true;
            }
        }
        return false;
    }

    public boolean cambiarPrecio(String titulo){
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                System.out.println("Ingrese nuevo precio");
                libro.setPrecio(ingreso.nextDouble());
                return true;
            }
        }
        return false;

    }

}
