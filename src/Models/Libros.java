package Models;

import java.util.ArrayList;
import java.util.List;

public class Libros {
    List<Libro> libros;

    public Libros() {
        this.libros = new ArrayList<>();
    }
    public Libros(int size) {
        this.libros = new ArrayList<>(size);
    }
    public void add(Libro libro) {
        this.libros.add(libro);
    }
    public Libro buscarLibroTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }else {
                System.out.println("Libro no encontrado");
            }
        }
    }

}
