/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
cada familia la cantidad de hijos para averiguar la media de edad de los hijos
de todas las familias.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde

        int N, M = 0, edad, sumaEdad = 0, contadorHijos = 0;
        double edadMedia;
        
        System.out.print("Ingrese el numero total de familias a Ingresar: ");
        N = leer.nextInt();
        
        for (int i = 0; i < N; i++) {
            
            System.out.print("Ingrese el numero total de hijos de la familia "+ (i + 1) +": ");
            M = leer.nextInt();
            
            for (int j = 0; j < M; j++) {
                
                System.out.print("Ingrese la edad del hijo "+ (j + 1) +": ");
                edad = leer.nextInt();
                
                sumaEdad = sumaEdad + edad;
                
                contadorHijos++;
            }
        }
        
        edadMedia = sumaEdad / contadorHijos;
        
        System.out.println("La edad media total de los hijos de todas las familias es de "+ edadMedia +" años.");
    }
    
}
