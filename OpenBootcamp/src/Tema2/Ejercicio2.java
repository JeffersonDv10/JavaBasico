package Tema2;

public class Ejercicio2 {
    public static void main(String[] args) {

        double precio = 200.00;
        double iva = 18 ; // impuesto del 18%

        double precioTotal = funcion(precio,iva);
        System.out.println( " El precio con el IVA incluido es " + precioTotal);
    }

    static double funcion( double precio, double iva) {
        return precio * iva / 100 + precio;  // Obtenemos el porcentaje del precio y le sumamos a este mismo,
        // logrando el precio total con el iva incluido.

    }
}
