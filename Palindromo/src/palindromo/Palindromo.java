/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

import java.util.Scanner;

public class Palindromo {

    public static boolean esPalindromo(String frase) {
        boolean espalin = false;
        for (int i = 0; i <= (frase.trim().length() - 1); i++) {
            espalin = (frase.trim().toLowerCase().charAt(i) == frase.trim().toLowerCase().charAt(frase.length() - 1 - i));
        }
        return espalin;
    }

    public static void main(String[] args) {
        String frase, mensaje;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una frase y te diré si es o no un palindromo");
        frase = entrada.nextLine();
        mensaje = (esPalindromo(frase)) ? "Esta frase es un palíndromo" : "Esta frase no es un palíndromo";
        System.out.println(mensaje);

    }

}
