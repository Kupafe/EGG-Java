/*
EJERCICIO 6
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        int numeroA, numeroB;
                
        System.out.print("Ingresa tu Primer Numero: ");
        numeroA = leer.nextInt();

        System.out.print("Ingresa tu Segundo Numero: ");
        numeroB = leer.nextInt();
        
        if (numeroA > 25){
            
            System.out.print("El Primer numero " + numeroA + " SI es Mayor al Numero 25 ");
        
        }else{
            
            System.out.print("El Primer numero " + numeroA + " No es Mayor al Numero 25 ");
        }
            
        if (numeroB > 25){
            
            System.out.println("y el Segundo numero " + numeroB + " SI es Mayor al Numero 25 ");
        
        }else{
            
            System.out.println("y el Segundo numero " + numeroB + " No es Mayor al Numero 25 ");
        }
    }
}
