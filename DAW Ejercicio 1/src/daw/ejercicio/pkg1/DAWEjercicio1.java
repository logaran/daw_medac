/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author logar
 */
public class DAWEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Ejercicio 1. Calcular el area de un cuadrado o rectángulo*/
        //Declaramos las variables
        int base, altura, area;
        
        //Instanciamos el objeto "lectura" para recibir los datos por teclado
        Scanner lectura = new Scanner (System.in);
        
        //Mostramos las instrucciones
        System.out.println("Vamos a calcular el area de un cuadrado o rectangulo. Introduce los datos en cm");
        //Solicitamos la medida de la base
        System.out.println("Introduce la medida de la base del cuadrado o rectángulo: ");
        
        //Asignamos el valor leido a la variable base
        base = lectura.nextInt();
        
        //Solicitamos la medida de la altura
        System.out.println("Introduce la medida de la altura del cuadrado o rectángulo: ");
        
        //Asignamos el valor leido a la variable base
        altura = lectura.nextInt();
        
        //Calculamos el area
        area = base * altura;
        
        //Mostramos el resultado
        
        System.out.println("El area de tu polígono es: " + area + " cm2");
        
    }
    
}
