/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.positivo.o.negativo;

import java.util.Scanner;

/**
 * Pedir un número e indicar si es positivo o negativo.
 * @author logaran
 */
public class DAWPositivoONegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;                                 // Declaramos la variable numero
        Scanner entrada = new Scanner(System.in);   // Instanciamos nuestro Scanner de teclado
        System.out.println("Introduce un numero");  // Pedimos el número
        numero = entrada.nextInt();                 // Lo asignamos a nuestra variable
        if (numero >= 0){
            System.out.println("El numero " + numero + " es positivo"); // Mensaje si es positivo
            // System.exit(0);                      // Finalizamos el programa. Si no, tambien se ejecutaria la linea fuera del IF
            return;                                 // Finalizamos el programa. Si no, tambien se ejecutaria la linea fuera del IF
        }
        System.out.println("El numero " + numero + " es negativo");     // Mensaje si es negativo
    }
    
}
