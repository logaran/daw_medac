package daw.tres.numeros.ordenados;

import java.util.Scanner;

public class DAWTresNumerosOrdenados {

    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        n1 = entrada.nextInt();
        System.out.println("Introduce el segundo numero");
        n2 = entrada.nextInt();
        System.out.println("Introduce el tercer numero");
        n3 = entrada.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1);
            if (n2 > n3) {
                System.out.println(n2);
                System.out.println(n3);
            } else {
                System.out.println(n3);
                System.out.println(n2);
            }
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2);
            if (n1 > n3) {
                System.out.println(n1);
                System.out.println(n3);
            } else {
                System.out.println(n3);
                System.out.println(n1);
            }
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3);
            if (n1 > n2) {
                System.out.println(n1);
                System.out.println(n2);
            } else {
                System.out.println(n2);
                System.out.println(n1);

            }
        }
    }
}
