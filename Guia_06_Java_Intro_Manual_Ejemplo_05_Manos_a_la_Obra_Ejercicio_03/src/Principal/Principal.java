/*
EJERCICIO 3
Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo. 
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        double numero1, numero2;

        System.out.println("----- BIENVENIDOS. -----\n\n"
                + "En este programa se debe definir variables donde se pueda alojar los resultados y probar usar dos operadores de cada tipo.\n");
        
        System.out.print("Ingrese un numero (puede ser positivo o negativo): ");
        numero1 = leer.nextDouble();
        
        System.out.print("Ingrese un numero (puede ser positivo o negativo): ");
        numero2 = leer.nextDouble();
        
        System.out.println("La SUMA del numero " + numero1 + " mas el numero "+ numero2 + " da como resultado el numero " + (numero1 + numero2) + ".");
        System.out.println("La RESTA del numero " + numero1 + " menos el numero "+ numero2 + " da como resultado el numero " + (numero1 - numero2) + ".");
        System.out.println("La RESTA del numero " + numero2 + " menos el numero "+ numero1 + " da como resultado el numero " + (numero2 - numero1) + ".");
        System.out.println("La MULTIPLICACION del numero " + numero1 + " por el numero "+ numero2 + " da como resultado el numero " + (numero1 * numero2) + ".");
        
        if (numero1 >= numero2){
            
            System.out.println("La DIVISION del numero " + numero1 + " dividido el numero "+ numero2 + " da como resultado el numero " + (numero1 / numero2) + ".");
            
        }else{
            
            System.out.println("La DIVISION del numero " + numero2 + " dividido el numero "+ numero1 + " da como resultado el numero " + (numero2 / numero1) + ".");
        }
    }
}
