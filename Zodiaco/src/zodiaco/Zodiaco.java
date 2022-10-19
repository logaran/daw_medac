/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zodiaco;

import java.util.Scanner;

/**
 *
 * @author logar
 */
public class Zodiaco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Vamos a decir el signo del zodiaco segun la fecha introducida.
        // Primero las variables
        int dia, mes;

        System.out.println("Di tu fecha de nacimiento y te diré cual es tu signo del zodíaco");
        Scanner entrada = new Scanner(System.in); // ya tenemos nuestro scanner para leer el teclado

        do {
            System.out.println("Introduce el mes de tu nacimiento (1-12)");
            mes = entrada.nextInt();
        } while (mes < 1 || mes > 12);

        switch (mes) {
            case 2:
                do {
                    System.out.println("Introduce el día de tu nacimiento (1-28)");
                    dia = entrada.nextInt();
                } while (dia < 1 || dia > 28);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                do {
                    System.out.println("Introduce el día de tu nacimiento (1-31)");
                    dia = entrada.nextInt();
                } while (dia < 1 || dia > 31);
                break;
            default:
                do {
                    System.out.println("Introduce el día de tu nacimiento (1-30)");
                    dia = entrada.nextInt();
                } while (dia < 1 || dia > 30);
                break;

        }
        
        if ((mes == 3 && dia >=21) || (mes == 4 && dia <=20)){
            System.out.println("Eres Aries");
        }
        if ((mes == 4 && dia >=21) || (mes == 5 && dia <=21)){
            System.out.println("Eres Tauro");
        }
        if ((mes == 5 && dia >=22) || (mes == 6 && dia <=21)){
            System.out.println("Eres Géminis");
        }
        if ((mes == 6 && dia >=21) || (mes == 7 && dia <=23)){
            System.out.println("Eres Cáncer");
        }
        if ((mes == 7 && dia >=24) || (mes == 8 && dia <=23)){
            System.out.println("Eres Leo");
        }
        if ((mes == 8 && dia >=24) || (mes == 9 && dia <=23)){
            System.out.println("Eres Virgo");
        }
        if ((mes == 9 && dia >=24) || (mes == 10 && dia <=23)){
            System.out.println("Eres Libra");
        }
        if ((mes == 10 && dia >=24) || (mes == 11 && dia <=22)){
            System.out.println("Eres Escorpio");
        }
        if ((mes == 11 && dia >=23) || (mes == 12 && dia <=21)){
            System.out.println("Eres Sagitario");
        }
        if ((mes == 12 && dia >=22) || (mes == 1 && dia <=20)){
            System.out.println("Eres Capricornio");
        }
        if ((mes == 1 && dia >=21) || (mes == 2 && dia <=19)){
            System.out.println("Eres Acuario");
        }
        if ((mes == 2 && dia >=20) || (mes == 3 && dia <=20)){
            System.out.println("Eres Piscis");
        }
        

    }

}
