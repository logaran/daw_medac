/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.cual.es.mayor;

import java.util.Scanner;

/**
 * Pedir dos números y decir cual es el mayor.
 *
 * @author logar
 */
public class DAWCualEsMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2;                 // Declaramos las dos variables
        Scanner entrada = new Scanner(System.in); // Nuestro lector de teclado
        System.out.println("Introduce el primer numero");    // Pedimos el numero
        n1 = entrada.nextInt(); // Lo asignamos a n1
        System.out.println("Introduce el segundo numero");    // Pedimos el numero
        n2 = entrada.nextInt(); // Lo asignamos a n2

        if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
            return;
        } else if (n2 > n1) {
            System.out.println(n2 + " es mayor que " + n1);
            return;
        }
            System.out.println(n2 + " y " + n1 + " son iguales");

    }

}
