/*
DETECCIÓN DE ERRORES
Arreglar la siguiente porción de codigo.
public static void main(String[] args) {
Scanner leer = new Scanner();
System.out.println("Ingresa tu edad");
String nombre = leer.nextInt();
System.out.println("Ingresa tu nombre");
int edad = leer.next();
}
}
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = leer.next();

        System.out.print("Ingresa tu edad: ");
        int edad = leer.nextInt();
        
        System.out.println("Su nombre es " + nombre + " y tiene " + edad + " años.");
    }
}

                
