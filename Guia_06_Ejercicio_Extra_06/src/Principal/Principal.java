/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        int N, cantidadMenor = 0;
        double estatura, sumarEstatura = 0, estaturaMenor = 0;
        
        System.out.print("Ingrese la cantidad de personas a ingresar la estatura: ");
        N = leer.nextInt();
        
        for (int i = 0; i < N; i++) {
            
            System.out.print("Ingrese la estatura en metros de la persona "+ (i + 1) +" de "+ N +" personas: ");
            estatura = leer.nextDouble();
            
            sumarEstatura = sumarEstatura + estatura;
            
            if (estatura < 1.60) {
                cantidadMenor++;
                estaturaMenor = estaturaMenor + estatura;
            }
        }
        
        System.out.println("El promedio de estaturas que se encuentran por debajo"
                         + " de 1.60 metros es de"
                         + (estaturaMenor / cantidadMenor) +" metros y el promedio"
                         + " de estaturas en general es de "
                         + (sumarEstatura / N ) +" metros." );
    }
    
}
