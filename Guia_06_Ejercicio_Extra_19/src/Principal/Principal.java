/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package Principal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        int N;
        
        System.out.print("\nIngrese el tamaño Maximo del Vector: ");
        N = leer.nextInt();
        
        int[] vectorA = new int[N];
        int[] vectorB = new int[N];
        
        menu(vectorA, vectorB);
        
        System.out.println("FIN DE LA EJECUCION DEL PROGRAMA.");
    }
    
    public static void menu(int[] vectorA, int[] vectorB){
        
        Scanner leer = new Scanner(System.in);
        
        int opcion;
        boolean respuesta;
        
        System.out.print("MENU.\n"
                + "\t1 - Ingresar Valores Manualmente.\n"
                + "\t2 - Ingresar Valores Aleatorios.\n\n"
                + "Elija opcion: ");
        opcion = leer.nextInt();
        
        switch(opcion){
            
            case 1: 
                
                System.out.println("Ingresar valores para el Vector A.");
                ingresarValoresManuales(vectorA);
                System.out.println("Ingresar valores para el Vector B.");
                ingresarValoresManuales(vectorB);
                System.out.println(""
                        + "\nMostrar Vector A.\n"
                        + "--------------------------------------------------");
                mostrarVector(vectorA);
                
                System.out.println(""
                        + "\nMostrar Vector B.\n"
                        + "--------------------------------------------------");
                mostrarVector(vectorB);
                
                break;
                
            case 2:
                
                ingresarValoresAleatorios(vectorA, vectorB);
                
                System.out.println(""
                        + "\nMostrar Vector A.\n"
                        + "--------------------------------------------------");
                mostrarVector(vectorA);
                
                System.out.println(""
                        + "\nMostrar Vector B.\n"
                        + "--------------------------------------------------");
                mostrarVector(vectorB);
                
                break;
        }
        
        respuesta = vectoresIguales(vectorA, vectorB);
        
        if (respuesta){
            
            System.out.println("Los vectores A y B SI tienen los valores Iguales.");
        
        }else{
            
            System.out.println("Los vectores A y B NO tienen los valores Iguales.");
        }
        
        System.out.println(""
                        + "\nMostrar Vector A.\n"
                        + "--------------------------------------------------");
                mostrarVector(vectorA);
                
                System.out.println(""
                        + "\nMostrar Vector B.\n"
                        + "--------------------------------------------------");
                mostrarVector(vectorB);
    }
    
    public static void ingresarValoresManuales(int[] vector){
        
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < vector.length; i++) {
            
            System.out.print("Ingrese un valor para la posicion "+ (i + 1) +": ");
            vector[i] = leer.nextInt();
        }
    }
    
    public static void ingresarValoresAleatorios(int[] vectorA, int[] vectorB){
        
        for (int i = 0; i < vectorA.length; i++) {
            
            vectorA[i] = (int) (Math.random() * 100);
            vectorB[i] = (int) (Math.random() * 100);
        }
        
        System.out.println(""
                        + "\nMostrar Vector A.\n"
                        + "--------------------------------------------------");
                mostrarVector(vectorA);
                
                System.out.println(""
                        + "\nMostrar Vector B.\n"
                        + "--------------------------------------------------");
                mostrarVector(vectorB);
    }
    
    public static void mostrarVector(int[] vector){
        
        for (int i = 0; i < vector.length; i++) {
            
            System.out.println("Posicion "+ (i + 1) +": "+ vector[i] +".");
        }
    }
    
    public static boolean vectoresIguales(int[] vectorA, int[] vectorB){
        
        boolean sonVectoresIguales = true;
        
        for (int i = 0; i < vectorA.length; i++) {
            
            if(vectorA[i] != vectorB[i]){
                
                sonVectoresIguales = false;
                break;
            }
        }
        
        return sonVectoresIguales;
    }
}
