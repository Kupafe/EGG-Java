/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        int tamano, numeroABuscar, repetido = 0;
        
        do{
            
            System.out.print("Ingrese el tamaño maximo del vector: ");
            tamano = leer.nextInt();
            
        }while(tamano < 1);
        
        int[] vector = new int[tamano];
        
        for (int i = 0; i < tamano; i++) {
            
            vector[i] = (int) (Math.random() * 100);
            //System.out.println("Vector: "+ vector[i]);
        }
        
        System.out.print("Ingrese un numero a buscar: ");
        numeroABuscar = leer.nextInt();
        
        for (int i = 0; i < tamano; i++) {
            
            if(vector[i] == numeroABuscar){
                
                System.out.println("El numero "+ numeroABuscar +" se encontro en la posicion "+ i +".");
                repetido++;
            }
        }
        
        if(repetido > 0){
            
            System.out.println("El numero "+ numeroABuscar +" se repite "+ repetido +" veces.");
            
        }else{
            
            System.out.println("El numero "+ numeroABuscar +" no se encontro dentro del vector.");
        }
    }
}
