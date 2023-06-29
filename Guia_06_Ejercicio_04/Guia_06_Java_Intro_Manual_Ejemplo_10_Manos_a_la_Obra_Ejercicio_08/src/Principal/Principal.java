/*
EJERCICIO 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        int nota;
        
        System.out.print("Ingrese la ota del alumno (entre 0 y 10): ");
        nota = leer.nextInt();
        
        while(nota < 0 || nota > 10){
            
            System.out.print("Nota mal ingresada.\n"
                    + "Ingrese la ota del alumno (entre 0 y 10): ");
            nota = leer.nextInt();
        }
        
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.");
    }
}
