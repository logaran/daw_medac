/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fechacorrecta;

import java.util.Scanner;

//Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos.
public class FechaCorrecta {

    public static void main(String[] args) {
        int dia, mes, año;
        boolean correcta = false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el día");
        dia = entrada.nextInt();
        System.out.println("Introduce el mes");
        mes = entrada.nextInt();
        System.out.println("Introduce el año");
        año = entrada.nextInt();

        if ((año >= 0) && (dia > 0)) {
            if ((mes >= 1) && (mes <= 12)) {
                correcta = switch (mes) {
                    case 2 -> dia <= 28;
                    case 1, 3, 5, 7, 10, 12 -> dia <= 31;
                    default -> dia <= 30;
                };

            }

        }
        if (correcta) {
            System.out.println("La fecha " + dia + "-" + mes + "-" + año + " es correcta");
        } else {
            System.out.println("La fecha " + dia + "-" + mes + "-" + año + " no es correcta");
        }
    }
}
