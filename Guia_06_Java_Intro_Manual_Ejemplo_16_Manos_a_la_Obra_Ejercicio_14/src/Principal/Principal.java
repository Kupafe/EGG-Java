/*
EJERCICIO 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        // Creo un arreglo llamado vector con dimension 5
        // Solo se pueden alojar numeros enteros por el Tipode Dato "int"
            
            //int[] vector = new int[5];
            
        // Creo una matriz con dimension 3x3
        // Solo se pueden alojar cadenas en ella
            
            //String[][] matriz = new String[3][3];
            
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        int cantidad;
        
        System.out.print("Ingrese la cantidad de compañeros que va a tener el equipo: ");
        cantidad = leer.nextInt();
        
        String[]vectorEquipo = new String[cantidad];
        
        
    }
    
}
