/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */

package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        int numeroLimite, numero;
        int sumaNumero = 0;
        
        do{
            
            System.out.print("Ingrese un numero limite positivo: ");
            numeroLimite = leer.nextInt();
        
        }while(numeroLimite < 1);
        
        do{
            
            System.out.print("Ingrese un numero: ");
            numero = leer.nextInt();
            sumaNumero = sumaNumero + numero;
            
        }while (sumaNumero <= numeroLimite);
    
        System.out.println("El resultado de la suma de los numeros ingresados por el usuario es "+ sumaNumero +", la cual supero el numero limite que es "+ numeroLimite +".");
    }
    
    
}