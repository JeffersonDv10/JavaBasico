package Tema4;

public class Main {
    public static void main(String[] args) {

        SmartDevice vacio = new SmartDevice();

        SmartDevice smartDevice = new SmartDevice("Apple",2022);
        SmartWatch smartWatch = new SmartWatch("Apple",2022,"ZTE","Rojo","Reloj",583.21);
        SmartPhone smartPhone = new SmartPhone("Apple",2022,"AMD","Negro","Celular",254.54);
        
        System.out.println(" Reloj " + smartWatch);
        System.out.println(" Celular " + smartPhone);






    }
}
