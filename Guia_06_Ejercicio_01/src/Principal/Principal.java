/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
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
        
        System.out.println("El resultado de la suma: " + numeroA + " + " + numeroB + " da como resultado el numero: " + (numeroA + numeroB) + ".");
    }
}
