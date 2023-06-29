/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.

            2 7 6
Matriz =    9 5 1
            4 3 8

O sea:
    Fila 1 --> 2 + 7 + 6 = 15
    Fila 2 --> 9 + 5 + 1 = 15
    Fila 3 --> 4 + 3 + 8 = 15

    Columna 1 --> 2 + 9 + 4 = 15
    Columna 2 --> 7 + 5 + 3 = 15
    Columna 3 --> 6 + 1 + 8 = 15

    Diagonal Primaria --> 2 + 5 + 8 = 15
    Diagonal Secundaria --> 6 + 5 + 4= 15
 */

package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        
        int fila0, fila1, fila2, columna0, columna1, columna2, diagonalPrimaria, diagonalSecundaria;
        
        System.out.println("CARGAR MATRIZ.\n");
        cargarMatriz(matriz);
        
        System.out.println("MOSTRAR MATRIZ.\n");
        mostrarMatriz(matriz);
        
        // Resultado Fila 0
        fila0 = sumaFila(matriz, 0);
        
        System.out.println("Fila 0: "+ fila0);
        
        // Resultado Fila 1
        fila1 = sumaFila(matriz, 1);
        
        System.out.println("Fila 1: "+ fila1);
        
        // Resultado Fila 2
        fila2 = sumaFila(matriz, 2);
        
        System.out.println("Fila 2: "+ fila2);
        
        // Resultado Columna 0
        columna0 = sumaColumna(matriz, 0);
        
        System.out.println("Columna 0: "+ columna0);
        
        // Resultado Columna 1
        columna1 = sumaColumna(matriz, 1);
        
        System.out.println("Columna 1: "+ columna1);
        
        // Resultado Columna 2
        columna2 = sumaColumna(matriz, 2);
        
        System.out.println("Columna 2: "+ columna2);
        
        // Resultado Diagonal Primaria
        diagonalPrimaria = sumaDiagonalPrimaria(matriz);
        
        System.out.println("Diagonal Primaria: "+ diagonalPrimaria);
        
        // Resultado Diagonal Secundaria
        diagonalSecundaria = sumaDiagonalSecundaria(matriz);
        
        System.out.println("Diagonal Secundaria: "+ diagonalSecundaria);
        
        Falta comparar si todos son 15
    }
    
    public static void cargarMatriz(int[][] matriz){
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
                
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.print("Ingrese un numero para la Posicion I " + i +", J "+ j +": ");
                matriz[i][j] = leer.nextInt();
            }
            
            System.out.println("");
        }
    }

    public static void mostrarMatriz(int[][] matriz){
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.print(" ( "+ matriz[i][j] +" ) ");
            }
            
            System.out.println("");
        }
    }
    
    public static int sumaFila(int[][] matriz, int i){
        
        int suma = 0;
        
        for (int j = 0; j < 3; j++) {
        
            suma = suma + matriz[i][j];
            //System.out.println("Suma: " + suma);
        }
        return suma;
    }
    
    public static int sumaColumna(int[][] matriz, int j){
        
        int suma = 0;
        
        for (int i = 0; i < 3; i++) {
                
            suma = suma + matriz[i][j];
            //System.out.println("Suma: " + suma);
        }
        return suma;
    }
    
    public static int sumaDiagonalPrimaria(int[][] matriz){
        
        int suma = 0;
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 10; j++) {
                
                if (i == j){

                    suma = suma + matriz[i][j];
                    //System.out.println("Suma: " + suma);

                }
            }
        }
        
        return suma;
    }
    
    public static int sumaDiagonalSecundaria(int[][] matriz){
        
        int suma = 0;
        //j = 2;
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 2; j >= 0; j--) {
                
                if (i == j){

                    suma = suma + matriz[i][j];
                    //System.out.println("Suma: " + suma);

                }
            }
        }
        
        return suma;
    }
}
    
    
