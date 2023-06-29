/*
Simular la divisi�n usando solamente restas. Dados dos n�meros enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando s�lo restas. M�todo:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el n�mero de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 ? 13 = 37 una resta realizada
37 ? 13 = 24 dos restas realizadas
24 ? 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
�A�n no lo entendiste? Recomendamos googlear divisi�n con restas sucesivas.
 */
package Principal;

import java.util.Scanner;

public class Principal {
    
    

    public static void main(String[] args) {

        int numeroA, numeroB;
        
        numeroA = ingresarNumeroPositivo();
        numeroB = ingresarNumeroPositivo();
        
        verificarMayor(numeroA, numeroB);
        
        System.out.println("\nFIN DE LA EJECUCION DEL PROGRAMA.\n");
    }
    
    public static int ingresarNumeroPositivo(){
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las � y los tilde
    
        int numero;
        
        do{
        
            System.out.print("Ingrese un Numero, este debe de ser un numero positivo: ");
            numero = leer.nextInt();
            
        }while(numero < 1);
        
        return numero;
    }
    
    public static void verificarMayor (int numeroA, int numeroB){
        
        if(numeroA >= numeroB){
            
            calculo(numeroA, numeroB);
            
        } else {
            
            calculo(numeroB, numeroA);
        }
    }
    
    public static void calculo(int numero1, int numero2){
        
        int residuo = numero1, cociente = 0;
        
        do{
            residuo = residuo - numero2;

            cociente++;

        }while (residuo > numero2);
        
        System.out.println("El Residuo es: "+ residuo +" y el Cociente es: "+ cociente +".");
    }
}
