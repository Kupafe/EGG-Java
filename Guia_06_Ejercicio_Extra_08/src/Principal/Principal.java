/*
Escriba un programa que lea n�meros enteros. Si el n�mero es m�ltiplo de cinco debe
detener la lectura y mostrar la cantidad de n�meros le�dos, la cantidad de n�meros pares y
la cantidad de n�meros impares. Al igual que en el ejercicio anterior los n�meros
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las � y los tilde
        
        int numero, cantidadNumerosLeidos = 0, pares = 0, impares = 0;
        boolean multiplo5 = false;
        
        do{
            System.out.print("Ingrese un numero entero: ");
            numero = leer.nextInt();
            
            if (numero > 0){

                cantidadNumerosLeidos++;

                if (numero % 2 == 0){

                    pares++;

                }else{

                    impares++;
                }

                if(numero % 5 == 0){
                    multiplo5 = true;
                    break;
                }
            }
            
        }while (multiplo5 != true);
        
        System.out.println("La cantidad de numeros leidos son: "+ cantidadNumerosLeidos +" numeros,\n"
                + "de los cuales "+ pares +" son numeros pares y \n"
                        + impares +" son numeros impares");
    }
    
}
