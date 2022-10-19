/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.daw;

import java.util.Scanner;

/**
 *
 * @author logar
 */
public class ClaseDAW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaramos las variables
        int numero;
        int numero2;
        int resultado;
        Scanner numero_teclado = new Scanner(System.in);
        
        //Pido un número por pantalla
        System.out.println("Hola, dame un número");
        
        //Asigno ese número introducido
        numero = numero_teclado.nextInt();
        
        //Pido otro número por pantalla
        System.out.println("Hola, dame otro número");
        
        //Asigno ese número introducido
        numero2 = numero_teclado.nextInt();
        
        //realizo la suma
        
        resultado = numero + numero2;
        //Muestro el número por pantalla
        System.out.println("La suma de los numeros " + numero + " y " + numero2 + " es: " + resultado);        
    }
    
}
