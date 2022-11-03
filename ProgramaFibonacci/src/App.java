import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int serie[];
        int limite;
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantos números quieres que tenga tu serie de Fibonacci?");
        limite = entrada.nextInt();

        serie = new int[limite];
        serie[1] = 1;
        for (int i = 2; i <= limite - 1; i++) {
            serie[i] = serie[i - 1] + serie[i - 2];
        }
        System.out.println("Así queda tu serie de Fibonacci:");
        for (int i = 0; i <= limite - 1; i++) {
            if (i == limite-1) {
                System.out.print(serie[i]);
            } else {
                System.out.print(serie[i] + ", ");
            }
        }

    }
}
