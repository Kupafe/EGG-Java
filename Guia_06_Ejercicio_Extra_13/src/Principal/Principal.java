/*
Crear un programa que dibuje una escalera de n�meros, donde cada l�nea de n�meros comience en uno y termine en el n�mero de la l�nea. Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el n�mero 3:
1
12
123
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las � y los tilde
        
        int numero, i, j;
        
        do{
            
            System.out.print("Ingrese un numero entero positivo: ");
            numero = leer.nextInt();
            
        }while(numero <= 0);

        for (i = 0; i < numero + 1; i++) {
            
            for (j = 1; j <= i; j++) {
            
                System.out.print(j+" ");
            }
            
            System.out.println("");
        }
        
        System.out.println("");
    }
}
