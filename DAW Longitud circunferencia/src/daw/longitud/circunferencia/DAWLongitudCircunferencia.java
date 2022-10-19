/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.longitud.circunferencia;

import java.util.Scanner;

/**
 *
 * @author logar
 */
public class DAWLongitudCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedidmos el rádio de una circunferencia y davolvemos la longitud
        double r, l;                                                            // Declaramos las variables, r (radio) y l (longitud)
        Scanner entrada = new Scanner(System.in);                               // Instanciamos nuestro objeto Scanner para leer el teclado
        System.out.println("Intoduce el radio de tu circunferencia");           // Pedimos el valor por pantalla
        r = entrada.nextDouble();                                               // Lo asignamos a nuestra variable r
        
      
        l = 2 * Math.PI * r;                                                    // Calculamos la longitud
        System.out.println("La longitud de un circunferencia de radio = " + r + " es de " + l);  // Devolvemos el resultado
        
    }
    
}
