/*
EJERCICIO 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        int contador = 0;
        int numero, totalSuma = 0;
        boolean cero = false;
        
        do{
            
            System.out.print("Ingrese un numero: ");
            numero = leer.nextInt();
            
            contador++;
            System.out.println("Contador: " + contador + ".");
            
            if(numero == 0){
                
                cero = true;
                break;
            }
            
            if (numero > 0){
            
                totalSuma = totalSuma + numero;
            }
            
        }while(contador <= 20);
        
        if (cero == true){
            
            System.out.println("Se capturó el numero cero");
        }

        System.out.println("El total de la suma de los numeros positivos es " + totalSuma + " en total.");
        
        
    }
    
}
