package Models;

import Enums.Sexo;

public class Persona {
    //Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso
    //y altura.
    private String nombre = "";
    private String DNI = "";
    private int edad=0;
    private Sexo sexo = Sexo.M;
    private double weight=0;
    private double height=0;

    public Persona() {
    }

    public Persona(String nombre, int edad, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, String DNI, int edad, Sexo sexo, double weight, double height) {
        this.nombre = nombre;
        this.DNI = DNI//funcion private generaDNI();
        this.edad = edad;
        this.sexo = sexo;
        this.weight = weight;
        this.height = height;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getDNI() {
        return DNI;
    }



    public int getEdad() {
        return edad;
    }

    public Persona setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Persona setSexo(Sexo sexo) {
        this.sexo = sexo;
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public Persona setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public Persona setHeight(double height) {
        this.height = height;
        return this;
    }

}
