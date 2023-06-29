/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        String frase;
        
        System.out.print("Ingrese una frase: ");
        frase = leer.next();
        
        System.out.println("\nLa frase con todas las letras en mayusculas queda de la siguiente manera:\n\n"
                        + "\t\t" + frase.toUpperCase() + ".\n"
                        + "\nLa frase con todas las letras en minusculas queda de la siguiente manera:\n\n"
                        + "\t\t" + frase.toLowerCase() + ".\n");
    }
}

/*
Frase:
    Este ejerCICIO esta muy BUENO
*/