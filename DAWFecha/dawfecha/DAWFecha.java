package dawfecha;
import java.util.Scanner;
/**
 *
 * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 días.
 *
 */
public class DAWFecha {

    public static void main(String[] args) {
        int day = 0, month = 0, year =0; // Declaramos variables
        Scanner entrada = new Scanner(System.in); // Instanciamos nuestro objeto para leer el teclado.
        do {
            System.out.println("Introduce el día");
            day = entrada.nextInt();
        } while (day < 1 || day > 30);
        
        do {
            System.out.println("Introduce el mes");
            month = entrada.nextInt();
        } while (month < 1 || month > 12);
        
        do {
            System.out.println("Introduce el año");
            year = entrada.nextInt();
        } while (year == 0);
        
        System.out.println("la fecha introducida es: " + day + "/" + month + "/" + year);
        entrada.close();    
    }
     
}
