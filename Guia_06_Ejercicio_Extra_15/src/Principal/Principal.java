/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        int numeroA, numeroB, opcion;
        double resultado;

        do{

            menu();
            
            opcion = leer.nextInt();
            
            switch(opcion){
                
                case 1:
                    
                    System.out.print("\nIngrese su Primer Numero: ");
                    numeroA = leer.nextInt();
                    System.out.print("Ingrese su Segundo Numero: ");
                    numeroB = leer.nextInt();
                    
                    resultado = sumar(numeroA, numeroB);
                    System.out.println("\n"+ numeroA +" + " + numeroB +" = "+ resultado +".");

                    break;
                    
                case 2:
                    
                    System.out.print("\nIngrese su Primer Numero: ");
                    numeroA = leer.nextInt();
                    System.out.print("Ingrese su Segundo Numero: ");
                    numeroB = leer.nextInt();
                    
                    resultado = restar(numeroA, numeroB);
                    System.out.println("\n"+ numeroA +" - " + numeroB +" = "+ resultado+".");
                    
                    resultado = restar(numeroB, numeroA);
                    System.out.println("\n"+ numeroB +" - " + numeroA +" = "+ resultado+".");
                    
                    break;
                    
                case 3:
                    
                    System.out.print("\nIngrese su Primer Numero: ");
                    numeroA = leer.nextInt();
                    System.out.print("Ingrese su Segundo Numero: ");
                    numeroB = leer.nextInt();
                    
                    resultado = multiplicar(numeroA, numeroB);
                    System.out.println("\n"+ numeroA +" * " + numeroB +" = "+ resultado+".");
                    break;
                    
                case 4:
                    
                    System.out.print("\nIngrese su Primer Numero: ");
                    numeroA = leer.nextInt();
                    System.out.print("Ingrese su Segundo Numero: ");
                    numeroB = leer.nextInt();
                    
                    if (numeroA >= numeroB){
            
                        resultado = dividir(numeroA, numeroB);
                        System.out.println("\n"+ numeroA +" / " + numeroB +" = "+ resultado +".");
        
                    }else {
        
                        resultado = dividir(numeroB, numeroA);
                        System.out.println("\n"+ numeroB +" / " + numeroA +" = "+ resultado +".");
                    }
                    break;
                    
                case 0:
                    
                    System.out.println("Saliendo...");
                    break;
            }
        
        }while(opcion != 0);
        
        System.out.println("\nFIN DE LA EJECUCION DEL PROGRAMA.\n");
    }
    
    public static void menu(){
        
        System.out.print("\nMENU.\n"
                + "\t1 - Sumar.\n"
                + "\t2 - Restar.\n"
                + "\t3 - Multiplicar.\n"
                + "\t4 - Dividir.\n\n"
                + "\t0 - Salir.\n\n"
                + "Elija opcion: ");
        
    }
    
    public static double sumar(int numeroA, int numeroB){
        
        return numeroA + numeroB;
    }
    
    public static double restar(int numeroA, int numeroB){
        
        return numeroA - numeroB;
    }
    
    public static double multiplicar(int numeroA, int numeroB){
        
        return numeroA * numeroB;
    }
    
    public static double dividir(int num1, int num2){
        
        if (num1 >= num2){
            
            return num1 / num2;
        
        }else {
        
            return num2 / num1;
        }
    }
}
