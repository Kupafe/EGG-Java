/*
 Realizar la multiplicacion de un vector por una matriz

Dado un vector 1xN y una matriz NxM, el resultado del producto es 1xM

Ej. vector 1x2 * matriz 2x3 = producto 1x3

 v=|3,5| * m=|4,8,6| = |3*4+5.2,3*8+5*1,3*6+5*7| = |22,29,53|
             |2,1,7|
 */

package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        // declaracion y creacion del vector
        // tipo[] nombreVector = new tipo [Tamaño]
        
        // Declarar el arreglo de una dimension
        int[] vector;
        // Crear en memoria (construir/dimensionar) con el valor por defecto (cero para los enteros)
        vector = new int[2];
        // Los dos pasos en una linea
        int[] producto = new int[3];
        
        // Declaracion y creacion de una matriz
        // tipo[][] nombreMatriz = new tipo[Filas][Columnas]
        
        // Declaracion e inicializacion con valores predeterminados
        int[][] matriz = {{4, 8, 6}, {2, 1, 7}};
        
        // Declaracion y creacion de arreglos genericos
        // tipo[][]...[] nombreArreglo = new tipo[cardinalidad1][cardinalidad2]...[cardinalidadN];
        
        System.out.println("Ingrese los valores del vector de tamaño "+vector.length+":");
        Scanner leer = new Scanner(System.in);
        //int = 0 , porque los subindices de los arreglos en Java inician en cero
        for (int i = 0; i < vector.length; i++) {
            System.out.print("v["+i+"]=");
            // Acceder al valor i del vector
            vector[i] = leer.nextInt();
        }
        
        // Multiplica vector por matriz
        int sum;
        // ...para cada columna de la matriz...
        for (int j = 0; j < matriz[0].length; j++) {
            sum = 0;
            // ...recorro el vector y multiplico
            for (int i = 0; i < vector.length; i++) {
                sum += vector[i] * matriz[i][j];
            }
            
            producto[j] = sum;
        }
        
        String aux= "";
        
        //Mostrar vector
        System.out.println("* Vector:");
        // Bucle for "mejorado" (enhanced) // Linea 71 del video
    }
}
