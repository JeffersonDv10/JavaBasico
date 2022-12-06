package Tema5;

public class Coche {
    String marca;
    String modelo;
    int year;

    public Coche(){
    }
    public Coche(String marca, String modelo, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coche { " +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                '}';
    }
}
