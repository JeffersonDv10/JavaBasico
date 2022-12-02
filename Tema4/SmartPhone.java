package Tema4;

public class SmartPhone extends SmartDevice{

    String modelo;
    String color;
    String tipo;
    double precio;

    public SmartPhone(){

    }

    public SmartPhone(String empresa, int year, String modelo, String color, String tipo, double precio) {
        super(empresa, year);
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.precio = precio;
    }
}
