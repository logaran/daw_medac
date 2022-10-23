/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuarray;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 * @author Antonio Lozano García
 */
public class MenuArray {

    static Scanner entrada = new Scanner(System.in);
    static int[] myArray = new int[50];

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        char option = 'x';
        rellenar();
        pintarMenu(option);
        while (option != '0') {
            option = entrada.next().charAt(0);
            pintarMenu(option);
            switch (option) {
                case '1' -> {
                    mostrarArray(false);
                    System.out.println("\n Intoduce otra opción del menú");
                }
                case '2' -> {
                    mostrarArray(true);
                    System.out.println("\n Intoduce otra opción del menú");
                }
                case '3' -> {
                    System.out.print("El valor mas pequeño en este array es: ");
                    System.out.println(menor("menor"));
                    System.out.println("\n Intoduce otra opción del menú");
                }
                case '4' -> {
                    System.out.print("El valor mas grande en este array es: ");
                    System.out.println(menor("mayor"));
                    System.out.println("\n Intoduce otra opción del menú");
                }
                case '5' -> {
                    do {
                        System.out.println(existe());
                        System.out.println("\n ¿Quieres volver a probar (\"no\" para salir)");
                        option = entrada.next().charAt(0);
                    } while (option != 'n');
                    System.out.println("\n Introduce otra opción del menú");

                }
                case '6' -> {
                    cambia();
                }
                case '7' -> {
                    flip();
                }

            }

        }
    }

    public static void limpiarAnt() {
        try {
            Robot limpiar = new Robot();
            limpiar.keyPress(KeyEvent.VK_CONTROL);
            limpiar.keyPress(KeyEvent.VK_L);
            limpiar.keyRelease(KeyEvent.VK_CONTROL);
            limpiar.keyRelease(KeyEvent.VK_L);
            Thread.sleep(50);

        } catch (Exception e) {
            System.out.println("Error al limpiar la pantalla" + e.getMessage());
        }

    }

    public static void pintarMenu(char o) {
        limpiarAnt();

        System.out.println("Acabo de generar una lista de 50 numeros y esta son tus opciones");
        if (o == '1') {
            System.out.print("-->");
        }
        System.out.println("1. Mostrar el Array");
        if (o == '2') {
            System.out.print("-->");
        }
        System.out.println("2. Mostrar el Array en orden inverso");
        if (o == '3') {
            System.out.print("-->");
        }
        System.out.println("3. Buscar el número menor");
        if (o == '4') {
            System.out.print("-->");
        }
        System.out.println("4. Buscar el número mayor");
        if (o == '5') {
            System.out.print("-->");
        }
        System.out.println("5. Comprobar si existe un número en el Array");
        if (o == '6') {
            System.out.print("-->");
        }
        System.out.println("6. Cambiar el valor de un número");
        if (o == '7') {
            System.out.print("-->");
        }
        System.out.println("7. Cambiar dos números de posición");
        if (o == '0') {
            System.out.print("-->");
        }
        System.out.println("0. Salir");
        System.out.println("\n\n\n M. Recuperar menu");
        System.out.println("Introduce tu opcion y pulsa Enter");
    }

    public static void mostrarArray(boolean invertido) {
        if (!invertido) {
            System.out.println("Estos son los valores de tu array:");
            for (int i = 0; myArray.length > i; i++) {
                System.out.print(myArray[i]);
                if (i != myArray.length - 1) {
                    System.out.print(", ");
                }
                if ((i + 1) % 10 == 0) {
                    System.out.print("\n");
                }
            }
        } else {
            System.out.println("Estos son los valores de tu array en orden inverso:");
            for (int i = myArray.length - 1; i >= 0; i--) {
                System.out.print(myArray[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
                if (i % 10 == 0) {
                    System.out.print("\n");
                }
            }

        }
    }

    public static int menor(String valor) {
        int menor = myArray[0];
        int mayor = myArray[0];
        for (int i = 1; i <= myArray.length - 1; i++) {
            if (myArray[i] < menor) {
                menor = myArray[i];

            }
            if (myArray[i] > mayor) {
                mayor = myArray[i];

            }
        }
        if (valor.equals("menor")) {
            return menor;
        } else {
            return mayor;
        }

    }

    public static String existe() {
        System.out.println("Introduce el numero que estas buscando");
        int numero, indice = 0;
        boolean existe;
        numero = entrada.nextInt();

        do {
            existe = (myArray[indice] == numero);
            indice++;
        } while (indice <= myArray.length - 1 && !existe);
        String mensaje = (existe) ? "¡Bingo! tu número está en el array" : "Esta vez no has tenido suerte. Sigue buscando";
        return mensaje;
    }

    public static void cambia() {
        int valor, nuevoValor, cambios = 0;
        limpiarAnt();
        mostrarArray(false);
        System.out.println("\n¿Que valor quieres sustituir?");
        valor = entrada.nextInt();
        System.out.println("\n¿por que valor quieres cambiarlo?");
        nuevoValor = entrada.nextInt();
        for (int i = 0; i <= myArray.length - 1; i++) {
            if (myArray[i] == valor) {
                myArray[i] = nuevoValor;
                cambios++;
            }
        }
        if (cambios > 0) {
            System.out.println("Se han realizado un total de " + cambios + " sustituciones");
            System.out.println("Así queda tu nuevo array\n\n");
            mostrarArray(false);
        } else {
            System.out.println("El valor que me has pedido no estaba en el array, fijate mejor la próxima vez");
        }
        System.out.println("Pulsa \"m\" y enter para volver a ver el menu");

    }

    public static void flip() {
        int posicion, posicionNueva, temporal;
        boolean si;
        limpiarAnt();
        mostrarArray(false);
        System.out.println("\n¿Donde esta el valor que quieres desplazar '('entre 1 y 50')'");
        posicion = entrada.nextInt() - 1;
        if (posicion <= myArray.length && posicion >= 0) {
            System.out.println("El valor en la posicion " + posicion + " es: " + myArray[posicion] + "\n ¿correcto?");
            si = (entrada.next().charAt(0) == 's');
            if (si) {
                System.out.println("\n¿A donde quieres llevarlo'('entre 1 y 50')'");
                posicionNueva = entrada.nextInt() - 1;
                if (posicionNueva <= myArray.length && posicionNueva >= 0) {
                    System.out.println("El valor en la nueva posicion es: " + myArray[posicionNueva] + "\n ¿correcto?");
                    si = (entrada.next().charAt(0) == 's');
                    if (si) {
                        temporal = myArray[posicionNueva];
                        myArray[posicionNueva] = myArray[posicion];
                        myArray[posicion] = temporal;
                        System.out.println("una vez realizados los cambios...");
                        mostrarArray(false);
                        System.out.println("Pulsa \"m\" y enter para volver a ver el menu");
                    } else {
                        System.out.println("Ok, volvamos a empezar");
                        flip();
                    }

                } else {
                    System.out.println("Has introducido una posicion invalida. Intentalo de nuevo");
                    flip();
                }
            } else {
                System.out.println("Ok, volvamos a empezar");
                flip();
            }

        } else {
            System.out.println("Has introducido una posicion invalida. Intentalo de nuevo");
            flip();
        }
    }

    public static void rellenar() {
        for (int i = 0; i <= 49; i++) {
            myArray[i] = (int) (Math.random() * 1000);
        }
    }
}
