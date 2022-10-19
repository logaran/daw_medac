package exportaciones;

import java.util.Scanner;

public class Exportaciones {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // Primero las variables
        char pais, hortaliza;
        int totalE = 0, totalF = 0, totalA = 0, cantidad;
        String lectura, valorNumerico;
        // Creamos nuestro Scanner de teclado
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el registro con el siguiente formato \"PHNN\".\n"
                + "Siendo P el país (E, F, A), H la hortaliza (T, P, E)  y NN el número de toneladas.\n"
                + "Si quieres finalizar la entrada, introduce \"@\"");
        do {
            valorNumerico = "";
            lectura = entrada.nextLine().toLowerCase();
            // Procesamos las entradas mientras sean diferentes de @
            pais = lectura.charAt(0);
            hortaliza = (lectura.length() >= 2) ? lectura.charAt(1) : '\u0000';
            if (lectura.length() >= 3) {
                for (int n = 2; n < lectura.length(); n++) {
                    valorNumerico += lectura.charAt(n);
                }
                cantidad = Integer.parseInt(valorNumerico);
            } else {
                cantidad = 0;
            }

            switch (pais) {
                case 'e' -> {
                    switch (hortaliza) {
                        case 't', 'p', 'e' -> {
                            totalE += cantidad;
                            System.out.println(
                                    "Contalibizadas " + cantidad + " toneladas para " + pais + ", Total: " + totalE);

                        }
                        default ->
                            System.out.println("Introduce un código de hortaliza válido, por favor");
                    }
                }

                case 'f' -> {
                    switch (hortaliza) {
                        case 't', 'p', 'e' -> {
                            totalF += cantidad;
                            System.out.println(
                                    "Contalibizadas " + cantidad + " toneladas para " + pais + ", Total: " + totalF);

                        }
                        default ->
                            System.out.println("Introduce un código de hortaliza válido, por favor");
                    }
                }
                case 'a' -> {
                    switch (hortaliza) {
                        case 't', 'p', 'e' -> {
                            totalA += cantidad;
                            System.out.println(
                                    "Contalibizadas " + cantidad + " toneladas para " + pais + ", Total: " + totalA);

                        }
                        default ->
                            System.out.println("Introduce un código de hortaliza válido, por favor");
                    }
                }
                default -> {
                    if (pais != '@') {
                        System.out.println("Introduce un código de país válido, por favor");
                    }
                }
            }

        } while (pais != '@');
        if ((totalE != 0) || (totalF != 0) || (totalA != 0)) {

            if ((totalE > totalF) && (totalE > totalA)) {
                System.out.println("España es el mayor exportador con un total de " + totalE + " toneladas");
            }
            if ((totalF > totalA) && (totalF > totalE)) {
                System.out.println("Francia es el mayor exportador con un total de " + totalF + " toneladas");
            }
            if ((totalA > totalF) && (totalA > totalE)) {
                System.out.println("Alemania es el mayor exportador con un total de " + totalA + " toneladas");
            }
        } else {
            System.out.println("Parece que ningún país tiene registradas exportaciones");
        }
        entrada.close();
    }

}
