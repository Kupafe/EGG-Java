/*
Crear un programa que dado un numero determine si es par o impar.
 */

package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Ingrese un numero para saber si el mismo es un Numero Par o Impar: ");
        numero = leer.nextInt();
        
        if (numero % 2 == 0){
            
            System.out.println("El numero "+ numero +" es Par.");
        
        }else{
            
            System.out.println("El numero "+ numero +" es Impar.");
        }
    }

}