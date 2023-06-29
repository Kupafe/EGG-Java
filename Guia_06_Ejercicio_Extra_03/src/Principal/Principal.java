/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        String letra;
        int largo;
        
        do{
         
            System.out.print("Ingrese una Letra para ver si es una vocal o no: ");
            letra = leer.next();
            largo = letra.length();
        
        }while(largo != 1);
                
        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u") || letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
            
            System.out.println("La letra "+ letra +" SI es una vocal del abecedario.");
            
        }else{
            
            System.out.println("La letra "+ letra +" NO es una vocal del abecedario.");
        }
    }
}
