/*
EJERCICIO 5
Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
Scanner.
 */

package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero;
        boolean booleani;
        double doubli;
        char chari;
        
        System.out.println("----- BIENVENIDOS. -----\n\n"
                + " Este programa define una variable de tipo boolean, double y char, guarda información en ellas a través del\n" +
                "Scanner");
        
        do{
            
            System.out.print("Ingrese un valor, debe ser 0 o 1: ");
            numero = leer.nextInt();
        
        }while (numero != 0 && numero != 1);
        
        if (numero == 0){
            
            booleani = true;
            
        }else{
            
            booleani = false;
        }
        
        System.out.print("Ingrese un numero decimal - La parte decimal debe de estar separada por una coma y no por un punto: ");
        doubli = leer.nextDouble();
        
        System.out.print("Ingrese una letra: ");
        chari = leer.next().charAt(0);
        
        System.out.println("Usted ingreso el valor (Boolean)" + numero + " y por resultado da " + booleani+ ".");
        System.out.println("Usted ingreso el valor decimal (Double): " + doubli + ".");
        System.out.println("Usted ingreso la letra (Char): " + chari + ".");
    }
}
