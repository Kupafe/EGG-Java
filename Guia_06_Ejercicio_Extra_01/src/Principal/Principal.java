/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        int minutos, horasTotales, horas, dias;
        
        System.out.print("\nIngrese la cantidad de minutos a calcularle los dias y horas: ");
        minutos = leer.nextInt();
        
        horasTotales = minutos / 60;
        dias = horasTotales / 24;
        horas = horasTotales - (dias * 24);
        
        System.out.println("\nLa cantidad de "+ minutos +" minutos son convertidos en "+ dias +" dias y "+ horas +" horas.\n");
    }
}
