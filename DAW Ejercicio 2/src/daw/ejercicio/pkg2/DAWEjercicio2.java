/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.ejercicio.pkg2;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 *
 * @author logaran
 */
public class DAWEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //primero declaramos las variables
        double a, b, c;
        double resultado_1, resultado_2, discriminante;
        // Empezamos mostrando la descripción y especificando cuales son los valores que vamos a pedir
        System.out.println("Vamos a calcular una ecuación de 2º grado. Necesitaremos los valores de a, b y c");

        //Instanciamos el objeto entrada para leer los datos del teclado
        Scanner entrada = new Scanner(System.in);

        //Leemos los datos de teclado y los asignamos a las variable a, b y c respectivamente
        System.out.println("Introduce el valor de a: ");
        a = entrada.nextInt();
        System.out.println("Introduce el valor de b: ");
        b = entrada.nextInt();
        System.out.println("Introduce el valor de c: ");
        c = entrada.nextInt();

        //Calculamos el discriminante
        discriminante = pow(b, 2) - 4 * a * c;
        //Calculamos el primer resultado
        resultado_1 = (-1 * b + sqrt(discriminante)) / 2 * a;
        //Calculamos el segundo resultado
        resultado_2 = (-1 * b - sqrt(discriminante)) / 2 * a;

        // En base al valor del discriminante calculamos los resultados o informamos que no existen
        if (discriminante < 0) {
            System.out.println("Esta ecuacion no tiene soluciones reales");
        } else if (discriminante > 0) {
            //Devolvemos la solución
            System.out.println("El primer resultado es: " + resultado_1);
            System.out.println("El segundo resultado es: " + resultado_2);
        } else {
            System.out.println("La ecuacion tiene una única solución: " + resultado_1);
        }
    }
}
