/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package guia_06_ejercicio_02;

import java.util.Scanner;

public class Guia_06_Ejercicio_02 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        String nombre;
        
        System.out.print("Ingrese su/s nombre/s y apellido/s: ");
        nombre = leer.next();
        
        System.out.println("Usted se llama " + nombre + ".");
    }
}
