/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        float centigrados, fahrenheit;
        
        System.out.print("Ingrese la temperatura en Grados Centigrados para convertirlos en Grados Fahrenheit: ");
        centigrados = leer.nextFloat();
        
        fahrenheit = 32 + (9 * centigrados / 5);
        
        System.out.println(centigrados + " Grados Centigrados es igual a " + fahrenheit + " Grados Fahrenheit.");
        
    }
    
}
