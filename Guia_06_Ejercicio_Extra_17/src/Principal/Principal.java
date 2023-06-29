/*
Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo:
25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
¿Qué son los números primos?
Básicamente, un número primo es un número natural que tiene solo dos divisores
o factores: 1 y el mismo número. Es decir, es primo aquel número que se puede
dividir por uno y por el mismo número.
El primer número primo es 2, y hay 25 números primos entre 1 y 100, ellos son:
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73,
79, 83, 89 y 97.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        int numero, contador = 0;
        boolean esPrimo;
        String opcion;
        
        do{
            do{
                
                System.out.print("Ingrese un numero para ver si el mismo es un Numero Primo: ");
                numero = leer.nextInt();
                
            }while(numero < 1);
            
            esPrimo = verificarSiEsPrimo(numero);
            
            if (esPrimo == true){
            
               System.out.println("El numero "+ numero +" SI es PRIMO.");
            
            }else{
            
                System.out.println("El numero "+ numero +" NO es PRIMO.");
            }
            
            System.out.print("¿Desea verificar otro numero? - S (Si) / N (No).\n"
                    + "Ingrese opcion: ");
            opcion = leer.next();
            
        }while (opcion.equalsIgnoreCase("s"));
        
        System.out.println("FIN DE LA EJECUCION DEL PROGRAMA.");
    }
    
    public static boolean verificarSiEsPrimo(int numero){
        
        boolean retorno;
        int contador = 0;
        
        for (int i = 1; i <= numero; i++) {
            
            if(numero % i == 0){
                
                contador++;
            }
        }
        
        if (contador == 2){
            
            retorno = true;
            
        }else{
            
            retorno = false;
        }
        
        return retorno;
    }       
}