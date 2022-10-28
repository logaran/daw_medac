package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author logar
 */
public class Ejercicio18 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int day1, month1, year1, day2, month2, year2, lastDay1, contador = 0;

        System.out.println("Introduce el año de la primera fecha");
        do {
            year1 = entrada.nextInt();
        } while (year1 < 0);

        System.out.println("Introduce el mes de la primera fecha");
        do {
            month1 = entrada.nextInt();
        } while (month1 < 0 || month1 > 12);

        System.out.println("Introduce el día de la primera fecha");
        do {
            switch (month1) {
                case 2 ->
                    lastDay1 = 28;
                case 1,3,5,7,8,10,12 ->
                    lastDay1 = 31;
                default ->
                    lastDay1 = 30;
            }
            day1 = entrada.nextInt();
        } while (year1 < 0);

        System.out.println("Introduce el año de la segunda fecha");
        do {
            year2 = entrada.nextInt();
        } while (year2 < 0);

        System.out.println("Introduce el mes de la segunda fecha");
        do {
            month2 = entrada.nextInt();
        } while (month2 < 0 || month2 > 12);

        System.out.println("Introduce el día de la segunda fecha");
        do {
            switch (month2) {
                case 2 ->
                    lastDay1 = 28;
                case 1,3,5,7,8,10,12 ->
                    lastDay1 = 31;
                default ->
                    lastDay1 = 30;
            }
            day2 = entrada.nextInt();
        } while (year2 < 0);

        System.out.println("La primera fecha es " + day1 + "/" + month1 + "/" + year1);
        System.out.println("La segunda fecha es " + day2 + "/" + month2 + "/" + year2);

        if (year2 >= year1) {
            if (month2 >= month1) {
                if (day2 >= day1) {
                    while (year2 != year1 || month2 != month1 || day2 != day1) {
                        contador++;
                        day1++;
                        if (day1 > lastDay1) {
                            day1 = 1;
                            month1++;
                            switch (month1) {
                                case 2 ->
                                    lastDay1 = 28;
                                case 1,3,5,7,8,10,12 ->
                                    lastDay1 = 31;
                                default ->
                                    lastDay1 = 30;
                            }
                            if (month1 > 12) {
                                month1 = 1;
                                year1++;
                            }
                        }
                    }

                    System.out.println("Y, entre una y otra, han pasado " + contador + " días");
                } else {
                    System.out.println("La segunda fecha es anterior a la primera");
                }

            }

        }
    }
}
