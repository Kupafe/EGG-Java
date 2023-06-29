/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        int numero;
        
        do{
            
            System.out.print("Ingrese un Numero Entero del 1 al 1o para mostrarlo en Numero Romano: ");            
            numero = leer.nextInt();
            
        }while(numero < 1 || numero > 10);
        
        switch(numero){
            
            case 1:
                System.out.println("El numero "+ numero +" en Numero Romano es: I.");
                break;
                
            case 2:
                System.out.println("El numero "+ numero +" en Numero Romano es: II.");
                break;
                
            case 3:
                System.out.println("El numero "+ numero +" en Numero Romano es: III.");
                break;
                
            case 4:
                System.out.println("El numero "+ numero +" en Numero Romano es: IV.");
                break;
                
            case 5:
                System.out.println("El numero "+ numero +" en Numero Romano es: V.");
                break;
                
            case 6:
                System.out.println("El numero "+ numero +" en Numero Romano es: VI.");
                break;
                
            case 7:
                System.out.println("El numero "+ numero +" en Numero Romano es: VII.");
                break;
                
            case 8:
                System.out.println("El numero "+ numero +" en Numero Romano es: VII.");
                break;
                
            case 9:
                System.out.println("El numero "+ numero +" en Numero Romano es: IX.");
                break;
                
            case 10:
                System.out.println("El numero "+ numero +" en Numero Romano es: X.");
                break;
        }
        
    }
    
}
