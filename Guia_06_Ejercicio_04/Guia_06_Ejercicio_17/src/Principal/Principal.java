/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */

package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        int tamano, unDigito = 0, dosDigitos = 0, tresDigitos = 0, cuatroDigitos = 0, cincoDigitos = 0;
        
        do{
            
            System.out.print("Ingrese el tamaño maximo del vector: ");
            tamano = leer.nextInt();
            
        }while(tamano < 1);
        
        int[] vector = new int[tamano];
        
        for (int i = 0; i < tamano; i++) {
            
            vector[i] = (int) (Math.random() * 99999);
            System.out.println("Vector: "+ vector[i]);
        }
        
        for (int i = 0; i < tamano; i++) {
            
            if(vector[i] >= 0 && vector[i] <= 9){
                
                unDigito++;
                
            } else if(vector[i] >= 10 && vector[i] <= 99){
                
                dosDigitos++;
            
            } else if(vector[i] >= 100 && vector[i] <= 999){
                
                tresDigitos++;
            
            } else if(vector[i] >= 1000 && vector[i] <= 9999){
                
                cuatroDigitos++;
            
            } else if(vector[i] >= 10000 && vector[i] <= 99999){
                
                cincoDigitos++;
            }
        }
        
        System.out.println("La cantidad de numeros de UN DIGITO son: "+ unDigito +",\n"
                    + "la cantidad de numeros de DOS DIGITOS son: "+ dosDigitos +",\n"
                    + "la cantidad de numeros de TRES DIGITOS son: "+ tresDigitos +",\n"
                    + "la cantidad de numeros de CUATRO DIGITOS son: "+ cuatroDigitos +",\n"
                    + "la cantidad de numeros de CINCO DIGITOS son: "+ cincoDigitos +".");
    }
}
