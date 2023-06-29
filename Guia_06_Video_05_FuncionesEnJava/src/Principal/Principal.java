package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       
        int resultado = suma(10, 10);
        
        System.out.println("El resultado de 10 + 10 es igual a "+ resultado +".");
        
        saludoPersonalizado("Chiquito");
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        System.out.print("Ingrese un nombre: ");
        String nombre = leer.next();
        saludoPersonalizado(nombre);
        
        System.out.print("Ingrese un nombre: ");
        saludoPersonalizado(leer.next());
    }
    
    public static int suma(int a, int b){
        
        // Logica
        int c = a + b;
        
        return c;
    }
    
    public static void saludoPersonalizado(String nombre){
        
        System.out.println("Hola "+ nombre + ", ¿como estas?");
    }
    
}
