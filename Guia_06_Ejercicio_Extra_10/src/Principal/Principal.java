/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        int numeroA, numeroB, resultado, numero;
        boolean respuesta = false;
        
        numeroA = (int) (Math.random() * 10);
        numeroB = (int) (Math.random() * 10);
        
        resultado = numeroA * numeroB;
        
        do{
            
            System.out.print("Ingrese un numero entero que se encuentre dentro del 0 al 100 inclusive: ");
            numero = leer.nextInt();
            
            if (resultado != numero){
                
                System.out.println("Su respuesta es Incorrecta.");
                
            }else{
                
                System.out.println("Su respuesta es Correcta.");
                respuesta = true;
            }
            
        }while(respuesta == false);
        
        System.out.println("FIN DE LA EJECUCION DEL PROGRAMA.");
    }
}
