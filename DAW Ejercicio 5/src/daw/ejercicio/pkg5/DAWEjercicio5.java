/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.ejercicio.pkg5;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author logar
 */
public class DAWEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 5, calculo de interés compuesto
        // Declaramos variables
        double capital, interes, anios, capitalFinal;
        
        //Instanciamos nuestro Scanner para pedir los datos por teclado
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos los valores
        System.out.println("Introduce el capital inicial");
        capital = entrada.nextDouble();
        
        System.out.println("Introduce el interes");
        interes = entrada.nextDouble() / 100;
        
        System.out.println("Introduce el tiempo de depósito");
        anios = entrada.nextDouble();
        
        //Calculamos el interes compuesto
        capitalFinal = pow((1 + interes),anios) * capital;
        System.out.println("Tu capital final seria de: " + capitalFinal);
        
    }
    
}
