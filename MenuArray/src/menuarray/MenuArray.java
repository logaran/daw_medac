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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option = -1;
        //Scanner entrada = new Scanner(System.in);
        int[] myArray = new int[50];
        for (int i = 0; i <= 49; i++) {
            myArray[i] = (int) (Math.random() * 1000);
        }
        pintarMenu(option);
        while (option != 0) {
            option = entrada.nextInt();
            pintarMenu(option);
            switch (option) {
                case 1 ->
                    mostrarArray(myArray, false);
                case 2 ->
                    mostrarArray(myArray, true);
                case 3 -> {
                    System.out.print("El valor mas pequeño en este array es: ");
                    System.out.println(menor(myArray, "menor"));
                }
                case 4 -> {
                    System.out.print("El valor mas grande en este array es: ");
                    System.out.println(menor(myArray, "mayor"));
                }
                case 5 -> {
                    System.out.println(existe(myArray));
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

    public static void pintarMenu(int o) {
        limpiarAnt();

        System.out.println("Acabo de generar una lista de 50 numeros y esta son tus opciones");
        if (o == 1) {
            System.out.print("-->");
        }
        System.out.println("1. Mostrar el Array");
        if (o == 2) {
            System.out.print("-->");
        }
        System.out.println("2. Mostrar el Array en orden inverso");
        if (o == 3) {
            System.out.print("-->");
        }
        System.out.println("3. Buscar el número menor");
        if (o == 4) {
            System.out.print("-->");
        }
        System.out.println("4. Buscar el número mayor");
        if (o == 5) {
            System.out.print("-->");
        }
        System.out.println("5. Comprobar si existe un número en el Array");
        if (o == 6) {
            System.out.print("-->");
        }
        System.out.println("6. Cambiar el valor de un número");
        if (o == 7) {
            System.out.print("-->");
        }
        System.out.println("7. Cambiar dos números de posición");
        if (o == 0) {
            System.out.print("-->");
        }
        System.out.println("0. Salir");
        System.out.println("Introduce tu opcion y pulsa Enter");
    }

    public static void mostrarArray(int[] lista, boolean invertido) {
        if (!invertido) {
            System.out.println("Estos son los valores de tu array:");
            for (int i = 0; lista.length > i; i++) {
                System.out.print(lista[i]);
                if (i != lista.length - 1) {
                    System.out.print(", ");
                }
                if ((i + 1) % 10 == 0) {
                    System.out.print("\n");
                }
            }
        } else {
            System.out.println("Estos son los valores de tu array en orden inverso:");
            for (int i = lista.length - 1; i >= 0; i--) {
                System.out.print(lista[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
                if (i % 10 == 0) {
                    System.out.print("\n");
                }
            }

        }
    }

    public static int menor(int[] lista, String valor) {
        int menor = lista[0];
        int mayor = lista[0];
        for (int i = 1; i <= lista.length - 1; i++) {
            if (lista[i] < menor) {
                menor = lista[i];

            }
            if (lista[i] > mayor) {
                mayor = lista[i];

            }
        }
        if (valor.equals("menor")) {
            return menor;
        } else {
            return mayor;
        }

    }

    public static String existe(int[] lista) {
        System.out.println("Introduce el numero que estas buscando");
        int numero, indice = 0;
        boolean existe;
        numero = entrada.nextInt();

        do {
            existe = (lista[indice] == numero);
            indice++;
        } while (indice <= lista.length - 1 && !existe);
        String mensaje = (existe) ? "¡Bingo! tu número está en el array" : "Esta vez no has tenido suerte. Sigue buscando";
        return mensaje;
    }
}
