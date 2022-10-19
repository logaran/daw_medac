package dawcifrasalreves;
import java.util.*;
/**
 *   Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
 * 
 */
public class DAWCifrasalreves {

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero entre 0 y 99999");
        numero = entrada.nextInt();
        
        // Primero lo hacemos como si fuera una cadena
        /*
        String anedac = ""; // Necesitaremos una variable para almacenar nuestra cadena invertida
        String cadena = Integer.toString(numero); // convertimos nuestro numero a cadena
        
        for (int i = cadena.length() -1; i >= 0; i--){
            anedac += cadena.charAt(i); //Vamos concatenando cada caracter a la cadena invertida
        }
        
        System.out.println("El numero original es " + numero + " e invertido es: " + anedac);
        */
        
        // Y ahora puramente numerico (bueno, no completamente)
        String anedac = "";
        while (numero != 0){
            anedac += Integer.toString( numero % 10);
            numero /= 10;
        }
        System.out.println(anedac);
        
    }
    
}
