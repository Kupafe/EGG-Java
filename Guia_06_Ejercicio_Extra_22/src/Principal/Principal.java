/*
Realizar un programa que rellene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
 
        //Crear Matriz
        
        crearMatriz();
        
        System.out.println("\nFIN DE LA EJECUCION DEL PROGRAMA.\n");
        
    }
    
    public static void crearMatriz(){
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        int N, M;
        
        System.out.print("\nIngrese la cantidad de Filas que va a tener la matriz: ");
        N = leer.nextInt();
        
        System.out.print("\nIngrese la cantidad de Columnas que va a tener la matriz: ");
        M = leer.nextInt();
        
        int[][] matriz = new int[N][M];
        
        for (int i = 0; i < N; i++) {
            
            for (int j = 0; j < M; j++) {
                
                matriz[i][j] = (int) (Math.random() * 10);
            }
            
        }
        
        mostrarMatriz(matriz, N, M);
    }
    
    public static void mostrarMatriz(int[][] matriz, int N, int M){
        
        System.out.println("\nMostrar los valores de la Matriz.\n");
        
        for (int i = 0; i < N; i++) {
            
            for (int j = 0; j < M; j++) {
                
                System.out.print(matriz[i][j]+ "  ");
            }
            System.out.println("");
        }
    }
    
}
