/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle ?while? y otra con el bucle ?do - while?.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        int n, numero, contador = 0, sumaNumero = 0, minimo = 999999999, maximo = -999999999, promedio = 0;
        boolean esMaximo = false, esMinimo = false;
        
        System.out.print("Ingrese el total maximo de numeros que va a ingresar: ");
        n = leer.nextInt();

        while (contador < n) {
            
            System.out.print("Ingrese un numero entero (negativo o positivo): ");
            numero = leer.nextInt();
            
            sumaNumero = sumaNumero + numero;
            System.out.println("Suma Numero: "+ sumaNumero);
            
            if (numero > maximo){
                
                maximo = numero;
                System.out.println("Maximo: "+ maximo);
                esMaximo = true;
            
            }else if(numero < minimo){
                
                minimo = numero;
                System.out.println("Minimo: "+ minimo);
                esMinimo = true;
            }
            
            contador++;
        }
        
        if (esMaximo == false){
            
            maximo = 0;
        }
        
        if (esMinimo == false){
            
            minimo = 0;
        }
        
        promedio = sumaNumero / n;
        
        System.out.println("El numero maximo que usted ingreso es "+ maximo +".\n"
                         + "El numero minimo que usted ingreso es "+ minimo +".\n"
                         + "El promedio de la suma de todos lo numeros ingresados es "+ promedio +".\n");
    }
}
