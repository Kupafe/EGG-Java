/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
medida que el usuario las va ingresando, construya una sopa de letras para
niños? de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. Una vez
concluida la ubicación de las palabras, rellene los espacios no utilizados con
un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de
letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan la
s siguientes funciones de Java substring(), Length() y Math.random().
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        String[][] matriz = new String[20][20];
        
        cargarMatrizAsterisco(matriz);
        
        for (int i = 0; i < 10; i++) {
            
            ingresarPalabra(matriz);
        }
    }
    
    public static void cargarMatrizAsterisco(String[][] matriz){
        
        for (int i = 0; i < 20; i++) {
            
            for (int j = 0; j < 20; j++) {
                
                matriz[i][j] = "*";
            }
        }
    }
    
    public static void mostrarMatriz(String[][] matriz){
        
        System.out.println("\nMOSTRAR MATRIZ.\n");
        
        for (int i = 0; i < 20; i++) {
            
            for (int j = 0; j < 20; j++) {
                
                System.out.print(matriz[i][j] +"  ");
            }
            
            System.out.println("");
        }
    }
    
    public static void ingresarPalabra(String[][] matriz){
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        String palabra;
        int largo;
        
        do{
                
            System.out.print("Ingrese una palabra de 3 a 5 caracteres: ");
            palabra = leer.next().toUpperCase();
            largo = palabra.length();

        }while(largo < 3 || largo > 5);
        
        buscarEspacioVacio(matriz, palabra, largo);
    }
    
    public static void buscarEspacioVacio(String[][] matriz, String palabra, int largo){
        
        int posicionI, posicionJ;
        boolean estaVacio = true;
        
        posicionI = (int)(Math.random() * 20);
        posicionJ = (int)(Math.random() * (20 - largo));
        
        if(matriz[posicionI][posicionJ] == "*"){
            
            estaVacio = revisarLargoPalabraMatrizVacio(matriz, posicionI, posicionJ, largo);
            
            if(estaVacio == true){
                
                cargarPalabraEnMatriz(matriz, palabra, posicionI, posicionJ, largo);

            }else{
                
                System.out.println("A buscar otra posicion");
                buscarEspacioVacio(matriz, palabra, largo);
            }
                    
        }else{
         
            System.out.println("A buscar otra posicion");
            buscarEspacioVacio(matriz, palabra, largo);
            
        }
    }
    
    public static void cargarPalabraEnMatriz(String[][] matriz, String palabra, int posicionI, int posicionJ, int largo){
        
        String letra;
        int a = 0;
        
        for (int j = 0; j < largo; j++) {

            letra = palabra.substring(a, a + 1);
            a++;
            matriz[posicionI][posicionJ] = letra;
            posicionJ++;
        }
        
        mostrarMatriz(matriz);    
    }
    
    public static boolean revisarLargoPalabraMatrizVacio(String[][] matriz, int posicionI, int posicionJ, int largo){
        
        boolean largoVacio = true;
        
        for (int j = posicionJ; j < 10; j++) {
            
            if(matriz[posicionI][j] != "*"){
                
                largoVacio = false;
            }
        }
        
        return largoVacio;
    }
}