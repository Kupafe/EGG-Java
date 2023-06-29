/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */

package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        String frase;
        
        System.out.print("Ingrese una frase: ");
        frase = leer.next();
        
        if (frase.equals("eureka")){
            
            System.out.println("La frase SI es correcta.");
            
        }else{
            
            System.out.println("La frase NO es correcta.");
        }
    }
    
}