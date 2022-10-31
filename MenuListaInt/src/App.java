import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Declaramos variables;
        Scanner entrada = new Scanner(System.in);
        int opcion = -1;
        String menu[] = { "0. Salir", "1. Generar Array", "2. Mostrar Array", "3. Mostrar Array invertido",
                "4. Ordenar Array", "5. Buscar Valor", "6. Sustituir valor", "7. Alternar posiciones" };
        Lista listaOriginal = new Lista(1);
        Lista listaActual;
        Menu miMenu = new Menu(menu);

        do {
            try {
                System.out.println(miMenu.mostrar(opcion));
                System.out.println("Introduce tu opción");
                opcion = entrada.nextInt();

            } catch (InputMismatchException e) {
                entrada.next();
                System.out.println("Me temo que esa no es un opción valida. Introduce un número entre 0 y 7");

            }
            switch (opcion) {
                case 1 -> {
                    if (!listaOriginal.isLlena()) {
                        int elementos;
                        do {
                            System.out.println("¿Cuantos elementos quiere que tenga tu lista?");
                            elementos = entrada.nextInt();
                            if (elementos <= 0) {
                                System.out.println("Esa sería una lista muy rara, ¿no te parece?");
                            }
                        } while (elementos <= 0);
                        listaOriginal = new Lista(elementos);
                        listaOriginal.generarValores();
                        miMenu.getElementos()[1] = "1. (RE) Generar Array";
                    } else {
                        System.out.println("Vas a sustituir los valores actuales de tu lista. ¿Estas seguro?");
                        if (entrada.next().equalsIgnoreCase("s")) {
                            listaOriginal.generarValores();
                        }
                    }
                }
                case 2 -> {
                    System.out.println(listaOriginal.toString(false));

                }
            }
        } while (opcion != 0);
        entrada.close();
    }

}
