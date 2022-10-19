/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.area.circulo;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author logar
 */
public class DAWAreaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedímos el radio y calculamos el área de un círculo. A=PI*R^2
               
        double a, r; //Area y Radio                                     // Empezamos declarando variables.
        Scanner entrada = new Scanner(System.in);                       // Instanciamos nuestro Scanner para leer el teclado
        System.out.println("Introduce el radio del circulo");           // Solicitamos el valor por pantalla
        r = entrada.nextDouble();                                       // Asignamos el valor introducido a la variable r
        a = PI * pow(r, 2);                                             // Calculamos el area. Usamos dos funciones,PI y pow de la libreria MATH. Netbeans nos sugiere las importaciones
        
        /* Podemos usar PI y Math de modo estático, ya que las hemos importado asi :import static java.lang.Math.PI;
        si no las importaramos de modo statico tendríamos que invocarlos así: Math.PI y Math.pow */
        
        System.out.println("El area de un cículo de radio=" + r +" es de " + a);
        
       
        
        
    }
    
}
