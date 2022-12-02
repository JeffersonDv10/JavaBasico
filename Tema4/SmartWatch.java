package Tema4;

public class SmartWatch extends SmartDevice{
    String modelo;
    String color;
    String tipo;
    double precio;

    public SmartWatch(){

    }
    public SmartWatch(String empresa, int year, String modelo, String color, String tipo, double precio) {
        super(empresa, year);
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.precio = precio;
    }
}
