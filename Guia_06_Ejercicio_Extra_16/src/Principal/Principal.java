/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra No.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        String nombre, opcion;
        int edad;
        
        do{
            
            System.out.print("Ingrese el nombre de la persona: ");
            nombre = leer.next();
            
            System.out.println("Ingrese la edad en años de "+ nombre +": ");
            edad = leer.nextInt();
            
            if (edad > 18){
                
                System.out.println(nombre +" es MAYOR DE EDAD ya que tiene "+ edad +" años.");
            
            }else{
                
                System.out.println(nombre +" es MENOR DE EDAD ya que tiene "+ edad +" años.");
            }
            
            System.out.print("Desea verificar otra persona (Si / No).\n"
                    + "Ingrese opcion: ");
            opcion = leer.next();
            
        }while(!opcion.equals("No"));
        
        System.out.println("FIN DE LA EJECUCION DEL PROGRAMA. ");
    }
    
}
