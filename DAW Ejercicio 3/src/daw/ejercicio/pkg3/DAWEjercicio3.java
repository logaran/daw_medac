/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author logar
 */
public class DAWEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 3. Leer dos números y mostrar todas las posibles operaciones con ellos
        // Declaramos las variable

        float numero1, numero2;

        //Creamos nuestro objeto para leer la entrada de teclado
        Scanner entrada = new Scanner(System.in);

        //Pedimos los dos numeros y asignamos los valores a las variable
        System.out.println("Introduce el primer numero:");
        numero1 = entrada.nextFloat();

        System.out.println("Introduce el Segundo numero:");
        numero2 = entrada.nextInt();

        //Devolvemos los resultados de las posibles operaciones básicas
        System.out.println("El resultado de multiplicar: " + numero1 + " por " + numero2 + " es: " + (numero1 * numero2));
        System.out.println("El resultado de dividir: " + numero1 + " entre " + numero2 + " es: " + (numero1 / numero2));
        System.out.println("El resultado de dividir: " + numero2 + " entre " + numero1 + " es: " + (numero2 / numero1));
        System.out.println("El resultado de sumar: " + numero1 + " y " + numero2 + " es: " + (numero1 + numero2));
        System.out.println("El resultado de restar: " + numero1 + " menos " + numero2 + " es: " + (numero1 - numero2));
        System.out.println("El resultado de restar: " + numero2 + " menos " + numero1 + " es: " + (numero2 - numero1));
        System.out.println("El resto de dividir: " + numero1 + " entre " + numero2 + " es: " + (numero1 % numero2));

    }

}
