import Enums.Sexo;
import Models.Libro;
import Models.Libros;
import Models.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        String nombre;
        String autor;
        int anio;
        double precio;
        Libro libro;
        System.out.println("Hello world!");
        Libros libros = new Libros();
        libros.add(new Libro("Si lo crees, lo creas", "Bryan Tracy", 1998, 20000));
        libros.add(new Libro("Ganar amigos e influir sobre las personas", "Dale Carnagie", 1930, 25000));
        libros.add(new Libro("Los 7 habitos de la gente altamente efectiva", "Stephen R. Covey", 1970, 30000));

        Persona Jeuss = new Persona("Jeuss",26, Sexo.F);

        do {
            menu();
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    libros.add(libros.agregarLibro());

                    break;
                case 2:
                    System.out.println("Introduzca el Titulo del libro para realizar la busqueda");
                    entrada.nextLine();
                    nombre = entrada.nextLine();
                    if(libros.buscarLibroTitulo(nombre)){
                        System.out.println("Libro encontrado");
                    }else {
                        System.out.println("Libro no encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Introduzca titulo del libro a eliminar");
                    entrada.nextLine();
                    nombre = entrada.nextLine();
                    if(libros.eliminarLibro(nombre)){
                        System.out.println("Libro eliminado");
                    }else{
                        System.out.println("Libro no encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Introduzca titulo del libro a modificar");
                    entrada.nextLine();
                    nombre=entrada.nextLine();
                    break;
                case 5:
                    Persona persona1 = new Persona();
                    System.out.println("Ingrerse nombre de la persona");
                    entrada.nextLine();
                    persona1.setNombre(entrada.nextLine());
                    System.out.println("Ingrese edad");
                    persona1.setEdad(entrada.nextInt());
                    System.out.println("Ingrese altura");
                    persona1.setHeight(entrada.nextDouble());
                    System.out.println("Ingrese peso");
                    persona1.setWeight(entrada.nextDouble());
                    entrada.nextLine();
                    System.out.println("Ingrese sexo");
                    persona1.setSexo(entrada.nextLine());
                    System.out.println(persona1.toString());
                    Persona persona2 = new Persona("Jeussa", 26, Sexo.M);
                    Persona persona3 = new Persona("Jeusso", 29, Sexo.F);

                    break;
            }
        }while (opcion !=0);
    }

    public static void menu(){
        System.out.println("------------Menu-----------");
        System.out.println("1. Añadir Libro");
        System.out.println("2. Buscar Libro");
        System.out.println("3. Eliminar Libro");
        System.out.println("4. Modificar Libro");
        System.out.println("5. Ver persona");
        System.out.println("0. Salir");
    }


}