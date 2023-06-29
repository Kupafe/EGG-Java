/*
EJERCICIO 4
Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por 
pantalla.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        String nombre;
        int edad;
        
        System.out.println("----- BIENVENIDOS. -----\n\n"
                + " Este programa define una variable que aloja un nombre y otra que guarda la edad, luego imprime ambas variables por \n" +
            "pantalla.\n");
        
        System.out.print("Ingrese su nombre: ");
        nombre = leer.next();
        System.out.print("Ingrese su edad: ");
        edad = leer.nextInt();
        
        System.out.println("Su nombre es " + nombre + " y tiene una edad de " + edad + " años.");
    }
    
}
