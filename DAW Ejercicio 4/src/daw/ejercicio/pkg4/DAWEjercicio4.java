/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author logar
 */
public class DAWEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 4, calcular el IMC
        
        //Empezamos, como siempre, declarando las variables
        
        float peso, altura, imc;
        
        //Instanciamos nuestro Scanner para leer el teclado
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos los valores
        System.out.println("Introduce tu peso en kilogramos");
        peso = entrada.nextFloat();
        
        System.out.println("Introduce tu altura en cm");
        altura = entrada.nextFloat();
        
        //Calculamos el IMC
        imc = peso / ((altura / 100) * (altura / 100));
        
        //Devolvemos el resultado
        
        System.out.println("Tu IMC es de: " + imc);
        
    }
    
}
