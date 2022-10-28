
import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) throws Exception {
        int numero;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Introduce un número");
            numero = entrada.nextInt();
            System.out.println("El cuadrado de tu número es: " + numero * numero);

        } while (numero >= 0);
        entrada.close();

    }
}
