package dawcuantas.cifras.tiene;

//import java.util.Scanner;
import java.util.*;

/**
 *
 * Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
 */
public class DAWCuantasCifrasTiene {

    public static void main(String[] args) {
        int numero, contador = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número");
        numero = entrada.nextInt();
        /*
        while (numero != 0) {
            numero /= 10;
            ++contador;
        }
        System.out.println("El numero introducidido tiene " + contador + " digitos");
         */
        String cadena = Integer.toString(numero);
        if (numero >= 0) {
            System.out.println("El numero " + numero + " tiene " + cadena.length() + " digitos");
        } else {
            System.out.println("El numero " + numero + " tiene " + (cadena.length() - 1) + " digitos");
        }

    }

}
