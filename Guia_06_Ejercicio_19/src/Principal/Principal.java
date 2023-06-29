/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

         MATRIZ             MATRIZ ANTI SIMETRICA
         0 -2  4                 0  2 -4
         2  0  2      --->      -2  0 -2
        -4 -2  0                 4  2  0

En este caso la matriz es anti simétrica.
 */

package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        int[][] matrizAntiSimetrica = new int[3][3];
        
        
        System.out.println("CARGAR MATRIZ.\n");
        
        cargarMatriz(matriz);
        
        System.out.println("\nMOSTRAR MATRIZ.\n");
        
        mostrarMatriz(matriz);
        
        System.out.println("\nCARGAR MATRIZ ANTI SIMETRICA.\n");
        
        cargarMatriz(matrizAntiSimetrica);
        
        System.out.println("\nMOSTRAR MATRIZ ANTI SIMETRICA.\n");
        
        mostrarMatriz(matrizAntiSimetrica);
        
       compararMatrices(matriz, matrizAntiSimetrica);
    
    }
       
        // COMPARAR MATRICES
        
    public static void compararMatrices(int[][] matriz, int[][] matrizAntiSimetrica){
            
        boolean esMatrizAntiSimetrica = true;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (matrizAntiSimetrica[i][j] != (matriz[i][j] / (-1))) {

                    esMatrizAntiSimetrica = false;
                }
            }
        }

        if (esMatrizAntiSimetrica == true){

            System.out.println("\nLas matrices SI son Anti Simetricas.\n");

        }else{

            System.out.println("\nLas matrices NO son Anti Simetricas.\n");
        }
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
}