package Tema2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) { 
        /* Crear una función que reciba un precio y devuelva el precio con el IVA incluido.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir un precio");
        double precio = sc.nextDouble();
        double iva = 18 ; // impuesto del 18%

        double result = precio * iva / 100;
        double total = result + precio ;
        System.out.println( " El precio con el IVA incluido es " + total);

    }

}
