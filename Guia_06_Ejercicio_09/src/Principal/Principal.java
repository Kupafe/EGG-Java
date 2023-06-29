/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        String frase, letra;
        
        System.out.print("Ingrese una frase: ");
        frase = leer.next();
        
        letra = frase.substring(0,1);
        
        if (letra.equals("A")){
            
            System.out.println("CORRECTO.");
            
        }else{
            
            System.out.println("INCORRECTO.");
        }
    }
}
