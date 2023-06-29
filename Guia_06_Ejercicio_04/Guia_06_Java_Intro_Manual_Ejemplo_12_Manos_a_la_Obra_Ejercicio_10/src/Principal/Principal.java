/*
EJERCICIO 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        int numero;
        
        for (int i = 0; i < 4; i++) {
            
            System.out.print("Ingrese un numero: ");
            numero = leer.nextInt();
            
            System.out.print(numero + " ");
            
            for (int j = 0; j < numero; j++) {
                
                System.out.print("*");
            }
            
            System.out.println("");
        }
        
        
    }
    
}
