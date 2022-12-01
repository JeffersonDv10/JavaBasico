package Tema3;

public class Ejercicio3 {

    public static void main(String[] args) {

        /*En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
          Tener en cuenta que los textos pueden venir de un array de tipo String.*/

        String salto = " ";
        String[] paises = {"España", "Alemania", "Italia", "Belgica"};

        for (String pais : paises) {
            String lista = pais.concat(salto);
            System.out.print(lista);

        }

    }
}
