/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.comparar.dos.numeros;

import java.util.Scanner;

/**
 *
 * @author logaran Pedir dos números y decir si son iguales o no.
 *
 */
public class DAWCompararDosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2;                                                 // Declaramos numero 1 y numero 2
        Scanner entrada = new Scanner(System.in);                   // Instanciamos objeto Scanner para leer teclado
        
        System.out.println("Intoduce el primer número");            // Pedimos el primer número
        n1 = entrada.nextInt();                                     // Lo asignamos a la variable n1
        System.out.println("Intoduce el segundo número");           // Pedimos el segundo número
        n2 =  entrada.nextInt();                                    // Lo asignamos a la variable n2
        if (n1 == n2){                                              // Comprobamos si los dos números son iguales
            System.out.println("Los dos números son iguales");      // Mensaje si son iguales
        } else {
            System.out.println("Los dos números son distintos");    // Mensaje si son distintos        
        }

    }

}
