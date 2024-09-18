package Models;

import java.util.UUID;

public class Libro {
    private String id;
    private String titulo;
    private String autor;
    private int ano;
    private double precio;

    public Libro(String titulo, String autor, int ano, double precio) {
        this.id = UUID.randomUUID().toString();
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.precio = precio;
    }

    public Libro() {
        this.id = UUID.randomUUID().toString();
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                ", precio=" + precio +
                '}';
    }
}
