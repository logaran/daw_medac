
/**
 * Realizar un juego para adivinar un número. Para ello pedir un número N, y luego
 * ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N.
 * El proceso termina cuando el usuario acierta.
 */

import java.util.Scanner;

public class Juego {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int numero, adivino, intentos = 0;
        String mensaje = "";

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer número o 0 si quieres que lo genere yo");
        numero = entrada.nextInt();
        numero = (numero != 0) ? numero : (int) Math.random() * 2147483647;
        do {
            mensaje = "";
            System.out.println("Intenta adivinar el número");
            adivino = entrada.nextInt();
            intentos++;
            if (numero == adivino) {
                mensaje = "¡Increible, lo has adivinado! y solo has necesitado " + intentos + " intentos";
            } else {
                mensaje = (adivino > numero) ? "tu número es mayor" : "tu numero es menor";

            }
            System.out.println(mensaje);

        } while (numero != adivino);
    }
}
