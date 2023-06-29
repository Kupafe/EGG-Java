/*
Crear una función rellene un vector con números aleatorios, pasándole un
arreglo por parámetro. Después haremos otra función o procedimiento que
imprima el vector.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        int N;
        
        System.out.print("\nIngrese el tamaño Maximo del Vector: ");
        N = leer.nextInt();
        
        int[] vector = new int[N];

        // Llenar Vector
        ingresarValoresAleatorios(vector);
        
        // Mostrar Vector
        mostrarVector(vector);
        
        System.out.println("\n\nFIN DE LA EJECUCION DEL PROGRAMA.\n");
    }
    
  
    public static void ingresarValoresAleatorios(int[] vector){
        
        for (int i = 0; i < vector.length; i++) {
            
            vector[i] = (int) (Math.random() * 100);
        }
    }
    
    public static void mostrarVector(int[] vector){
        
        System.out.println(""
                        + "\nMostrar Vector.\n");
                
        for (int i = 0; i < vector.length; i++) {
            
            System.out.print(vector[i] +"  ");
        }
    }
}