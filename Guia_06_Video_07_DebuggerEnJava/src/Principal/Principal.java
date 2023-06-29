package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
 
        Scanner leer = new Scanner(System.in);
        
        int numeroA, numeroB;
        
        System.out.println("Ingrese su Primer Numero: ");
        numeroA = leer.nextInt();
        
        System.out.println("Ingrese su Segundo Numero: ");
        numeroB = leer.nextInt();
        
        System.out.println("El numero es igual a "+ numeroA);
        System.out.println("El numero es igual a "+ numeroB);
    }
    
    
}
