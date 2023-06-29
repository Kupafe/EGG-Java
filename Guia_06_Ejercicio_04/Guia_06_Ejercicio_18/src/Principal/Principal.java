/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).

                1  0  4                         1  0  6
    MATRIZ A =  0  5  0     --->    MATRIZ B =  0  5  0
                6  0 -9                         4  0 -9
 */

package Principal;

public class Principal {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        
        System.out.println("CARGAR MATRIZ.\n");
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(" ( "+ matriz[i][j] +" ) ");
            }
            
            System.out.println("\n");
        }
        
        System.out.println("MATRIZ TRASPUESTA.\n");
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                //matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(" ( "+ matriz[j][i] +" ) ");
            }
            
            System.out.println("\n");
        }
    }
}
