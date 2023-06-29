/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().

sqrt(double a): Devuelve la raíz cuadrada positiva correctamente redondeada
                de un double.
 */
package Principal;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        int numero, doble, triple;
        double raizCuadrada;
        
        System.out.print("Ingrese un numero entero: ");
        numero = leer.nextInt();
        
        doble = numero * 2;
        triple = numero * 3;
        raizCuadrada = sqrt(numero);
        
        System.out.println("El Doble del numero "+ numero + " es " + doble + ".\n"
                + "El Triple del numero "+ numero + " es " + triple + ".\n"
                + "La Raiz Cuadrada del numero "+ numero + " es " + raizCuadrada + ".\n");
    }
}
