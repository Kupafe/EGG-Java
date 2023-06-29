/*
EJERCICIO 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        int numeroA, numeroB;
        
        System.out.print("Ingrese su Primer Numero: ");
        numeroA = leer.nextInt();
        
        System.out.print("Ingrese su Segundo Numero: ");
        numeroB = leer.nextInt();
        
        esMultiplo(numeroA, numeroB);
    }
    
    public static void esMultiplo(int numeroA, int numeroB){
            
        if (numeroA % numeroB == 0 ){
            
            System.out.println("El Numero " + numeroA + " SI es multiplo del numero " + numeroB + ".");
            
        }else{
            
            System.out.println("El Numero " + numeroA + " NO es multiplo del numero " + numeroB + ".");
        }
    }
}
