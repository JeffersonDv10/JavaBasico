package Tema4;

public class Main {
    public static void main(String[] args) {

        SmartDevice vacio = new SmartDevice();

        SmartDevice smartDevice = new SmartDevice("Apple",2022);
        SmartWatch smartWatch = new SmartWatch("Apple",2022,"ZTE","Rojo","Reloj",583.21);

        System.out.println(smartWatch.empresa);
        System.out.println(smartWatch.modelo);
        System.out.println(smartWatch.year);
        System.out.println(smartWatch.color);
        System.out.println(smartWatch.tipo);
        System.out.println(smartWatch.precio);

        SmartPhone smartPhone = new SmartPhone("Apple",2022,"AMD","Negro","Celular",254.54);

        System.out.println(smartPhone.empresa);
        System.out.println(smartPhone.modelo);
        System.out.println(smartPhone.year);
        System.out.println(smartPhone.color);
        System.out.println(smartPhone.tipo);
        System.out.println(smartPhone.precio);





    }
}
