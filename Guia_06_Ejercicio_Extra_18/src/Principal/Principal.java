/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector
de tamaño N, con los valores ingresados por el usuario.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        int N, suma = 0;
        
        System.out.print("\nIngrese el tamaño Maximo del Vector: ");
        N = leer.nextInt();
        
        int[] vector = new int[N];
        
        System.out.println("\nINGRESAR VALORES EN EL VECTOR.");
                
        for (int i = 0; i < vector.length; i++) {
            
            System.out.print("\nIngrese el un valor Entero en la posicion "+ (i + 1) +" del vector: ");
            vector[i] = leer.nextInt();
        }
        
        for (int i = 0; i < vector.length; i++) {
            
            suma = suma + vector[i];
        }
        
        System.out.println("\nEl resultado de la suma de todos los valores ingresados en el vector es: "+ suma +".\n");
    }
    
}
