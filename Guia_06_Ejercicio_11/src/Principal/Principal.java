/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
 */

package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
 
        Scanner leer = new Scanner(System.in);
        
        int numeroA, numeroB, opcion, resultado;
    
        System.out.print("Ingrese su Primer Numero: ");
        numeroA = leer.nextInt();
        
        System.out.print("Ingrese su Segundo Numero: ");
        numeroB = leer.nextInt();
        
        do{

            menu();

            System.out.print("Elija opción: ");
            opcion = leer.nextInt();

            switch(opcion){

                case 1:
                    System.out.println("El resultado de la SUMA de los numeros "+ numeroA +" + "+ numeroB +" da como resultado el siguiente numero: "+ suma(numeroA, numeroB)+ ".");
                    break;
                    
                case 2:
                    System.out.println("El resultado de la RESTA de los numeros "+ numeroA +" - "+ numeroB +" da como resultado el siguiente numero: "+ resta(numeroA, numeroB));
                    break;
                    
                case 3:
                    System.out.println("El resultado de la MULTIPLICACION de los numeros "+ numeroA +" * "+ numeroB +" da como resultado el siguiente numero: "+ multiplicar(numeroA, numeroB));
                    break;
                    
                case 4:
                    if (numeroA < numeroB){
                        
                        System.out.println("El resultado de la DIVISION de los numeros "+ numeroA +" / "+ numeroB +" da como resultado el siguiente numero: "+ dividir(numeroB, numeroA));
                        
                    }else{
                        
                        System.out.println("El resultado de la DIVISION de los numeros "+ numeroA +" / "+ numeroB +" da como resultado el siguiente numero: "+ dividir(numeroA, numeroB));
                    }
                    break;
                    
                case 5:
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    System.out.println("Ingreso mal la opcion");
                    break;

            }
        }while(opcion != 5);
        
        System.out.println("FIN DE LA EJECUCION DEL PROGRAMA.");
    }
    
    public static void menu(){
    
        int opcion;
        
        System.out.println(" ----- BIENVENIDOS AL MENU. ----- \n\n"
                + "\t1 - Sumar\n"
                + "\t2 - Restar\n"
                + "\t3 - Multiplicar\n"
                + "\t4 - Dividir\n"
                + "\t5 - Salir\n");
    }
    
    public static int suma(int numeroA, int numeroB){
        
        return numeroA + numeroB;
    }
    
    public static int resta(int numeroA, int numeroB){
        
        return numeroA - numeroB;
    }
    
    public static int multiplicar(int numeroA, int numeroB){
        
        return numeroA * numeroB;
    }
    
    public static int dividir(int num1, int num2){
        
        return num1 / num2;
    }
}