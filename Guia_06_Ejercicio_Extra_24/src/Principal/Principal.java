/*
Realizar un programa que complete un vector con los N primeros n�meros de la
sucesi�n de Fibonacci. Recordar que la sucesi�n de Fibonacci es la sucesi�n de
los siguientes n�meros:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los n�meros se calcula sumando los dos anteriores a �l. Por
ejemplo:
La sucesi�n del n�mero 2 se calcula sumando (1+1)
An�logamente, la sucesi�n del n�mero 3 es (1+2),
Y la del 5 es (2+3),
Y asi? sucesivamente?
La sucesi�n de Fibonacci se puede formalizar de acuerdo a la siguiente f�rmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el t�rmino ?n? debemos escribir una funci�n
que reciba como par�metro el valor de ?n? y que calcule la serie hasta llegar a
ese valor.
Para conocer m�s acerca de la serie de Fibonacci consultar el siguiente link:
https://quantdare.com/numeros-de-fibonacci/
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las � y los tilde
        
        int numero;
        
        System.out.print("Ingrese un numero para realizar la Sucesion de Fibonacci: ");
        numero = leer.nextInt();
    
        fibonacci(numero);
    
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.");
    }

    public static void fibonacci(int num) {
        
        int[] vector = new int[num];
        
        int num1 = 1;
        int num2 = 1;
        vector[0] = num1;

        if (num > 1) {
            
            vector[1] = num2;
        }
        
        for (int i = 2; i < num; i++) {
            
            vector[i] = num1 + num2;
            num1 = num2;
            num2 = vector[i];
        }
        if (num > 1) {
            
            for (int i = 0; i < num; i++) {
                
                System.out.println(vector[i]);
            }
            
        } else {
            
            System.out.println(vector[0]);
        }
    }
}