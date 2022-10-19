/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.dos.numeros.ordenados;

import java.util.Scanner;

/**
 *
 * @author logar
 */
public class DAWDosNumerosOrdenados {

    public static void main(String[] args) {
        // A partir de aquí vamos rápido y comentamos menos el código

        int n1, n2; //Variables
        Scanner entrada = new Scanner(System.in); // Para leer el teclado

        System.out.println("Introduce el primer numero");
        n1 = entrada.nextInt();
        System.out.println("Introduce el segundo numero");
        n2 = entrada.nextInt();

        if (n1 >= n2) {
            System.out.println(n1 + " y " + n2);
        } else {
            System.out.println(n2 + " y " + n1);
        }
    }

}
