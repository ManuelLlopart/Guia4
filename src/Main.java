import Models.Libro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        System.out.println("Hello world!");
        List<Libro> libros = new ArrayList<Libro>(10);
        libros.add(new Libro("Si lo crees, lo creas", "Bryan Tracy", 1998, 20000));
        libros.add(new Libro("Ganar amigos e influir sobre las personas", "Dale Carnagie", 1930, 25000));
        libros.add(new Libro("Los 7 habitos de la gente altamente efectiva", "Stephen R. Covey", 1970, 30000));

        System.out.println(libros.get(2).toString());
        do {
            menu();
            opcion = entrada.nextInt();
        }while (opcion =! 0);
    }

    public static void menu(){
        System.out.println("------------Menu-----------");
        System.out.println("1. Añadir Libro");
        System.out.println("2. Buscar Libro");
        System.out.println("3. Eliminar Libro");
        System.out.println("4. Modificar Libro");
        System.out.println("0. Salir");
    }
    public static void añadirLibro(List<Libro> libros){

    }

}