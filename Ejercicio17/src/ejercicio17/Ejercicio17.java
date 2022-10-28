package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author logar
 */
public class Ejercicio17 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int day, month, year, lastDay;
        do {
            System.out.println("Introduce el año");
            year = entrada.nextInt();
        } while (year < 0);
        do {
            System.out.println("Introduce el mes");
            month = entrada.nextInt();
        } while (month < 1 || month > 12);
        do {
            System.out.println("Introduce el día");
            day = entrada.nextInt();
            switch (month) {
                case 1,3,5,7,8,10,12 ->
                    lastDay = 31;
                case 2 ->
                    lastDay = 28;
                default ->
                    lastDay = 30;
            }
        } while (day < 0 || day > lastDay);
        System.out.println("La fecha introducida es " + day + "/" + month + "/" + year);
        day++;
        if (day > lastDay) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
         System.out.println("La fecha del día siguiente es " + day + "/" + month + "/" + year);

    }

}
