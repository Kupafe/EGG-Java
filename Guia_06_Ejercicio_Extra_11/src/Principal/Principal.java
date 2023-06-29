/*
Escribir un programa que lea un n�mero entero y devuelva el n�mero de d�gitos que
componen ese n�mero. Por ejemplo, si introducimos el n�mero 12345, el programa
deber� devolver 5. Calcular la cantidad de d�gitos matem�ticamente utilizando el operador
de divisi�n. Nota: recordar que las variables de tipo entero truncan los n�meros o
resultados.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las � y los tilde
        
        int numero;
        
        System.out.print("Ingrese un numero entero: ");
        numero = leer.nextInt();
        
        System.out.println("El n�mero " + numero + " tiene " + Integer.toString(numero).length() + " d�gitos");
    }
}