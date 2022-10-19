/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.comprobar.si.es.multiplo;

import java.util.Scanner;

/**
 * Pedir dos números y decir si uno es múltiplo del otro.
 *
 * @author logaran
 */
public class DAWComprobarSiEsMultiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2;                               // Declaramos las dos variables
        Scanner entrada = new Scanner(System.in);           // Nuestro lector de teclado (a ver si el próximo me acuerdo de importarlo yo y no Netbeans)
        System.out.println("Introduce el primer numero");   // Pedimos el primero
        numero1 = entrada.nextInt();                        // Lo asignamos a numero1
        System.out.println("Introduce el segundo numero");  // Pedimos el segundo
        numero2 = entrada.nextInt();                        // Lo asignamos a numero2
        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " es multiplo de " + numero2);  // Mensaje si el resto de la division es 0
            return;
        }
        System.out.println(numero1 + " no es multiplo de " + numero2);  // Mensaje si el resto de la division es distinto de 0

    }

}
