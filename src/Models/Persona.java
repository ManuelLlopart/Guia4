package Models;

import Enums.Sexo;

public class Persona {
    //Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso
    //y altura.
    private String nombre = "";
    private String DNI = "";
    private int edad = 0;
    private Sexo sexo = Sexo.M;
    private double weight = 0;
    private double height = 0;

    public Persona() {
        this.DNI = getDniRandom();
    }

    public Persona(String nombre, int edad, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = getDniRandom();
    }

    public Persona(String nombre, int edad, Sexo sexo, double weight, double height) {
        this.nombre = nombre;
        this.DNI = getDniRandom();
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

    public Persona setSexo(String sexo) {
        this.sexo = checkSex(sexo);
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

    private String getDniRandom() {
        String dni;
        int numDni = (int) Math.round(Math.random() * 100000000);
        dni = String.valueOf(numDni);

        return dni;
    }

    public int calcularIMC() {
        double imc = this.weight / (this.height * this.height);
        int rta;
        if (imc < 20) {
            rta = -1;
        } else if (imc >= 20 && imc <= 25) {
            rta = 0;
        } else {
            rta = 1;
        }
        return rta;
    }

    public boolean esMayorDeEdad() {
        boolean b = true;
        if (this.edad > 18) {
            b = false;
        }

        return b;
    }



    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    private Sexo checkSex(String sexoMucho) {
        return sexoMucho.compareToIgnoreCase(String.valueOf(Sexo.M)) == 0 ? Sexo.M : Sexo.F;
    }
}
