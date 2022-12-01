package Tema1;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        /* Crear el método main e imprimir todos los datos que se han visto en las sesiones.
           Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.*/
        
        String nombre = "Hola Mundo";
        byte number = 100;       // 1 byte
        short number2 = 10000;     // 2 byte
        int number3 = 1000000000;       // 4 byte
        long number4 = 1000000000;      // 8 byte
        float decimal = 4.9f;
        double decimal1 = 9.99f;
        boolean verdadero = true;
        boolean falso = false;

        System.out.println("byte : " + number);
        System.out.println("int : " + number3);
        System.out.println("short : " + number2);
        System.out.println("long : " + number4);
        System.out.println("double : " + decimal1);
        System.out.println("float : " + decimal);
        System.out.println("String : " + nombre);
        System.out.println("boolean : " + verdadero);
        System.out.println("boolean : " + falso);
    }
}
