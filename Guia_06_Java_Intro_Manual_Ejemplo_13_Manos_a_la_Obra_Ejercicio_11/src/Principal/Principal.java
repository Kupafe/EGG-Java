/*
EJERCICIO 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
    a e i o u
    @ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        String frase, punto, fraseFinal;
        int largoFrase;
        boolean tienePunto = false;
        
        do{
            
            System.out.print("Escriba una palabra o frase.\n"
                    + "La Frase debe de terminar con un punto.\n"
                    + "Ingrese la frase: ");
            frase = leer.next().toLowerCase();

            largoFrase = frase.length();

            punto = frase.substring(largoFrase - 1, largoFrase);

            System.out.println("Punto: " + punto);
            //cadena = cadena.substring(0,cadena.length()-1);

            System.out.println("Largo Frase: " + largoFrase);

            if(punto.equals(".")){

                System.out.println("Si");
                tienePunto = true;
            }
        
        }while (tienePunto == false);
        
        fraseFinal = convertirA(frase);
        fraseFinal = convertirE(fraseFinal);
        fraseFinal = convertirI(fraseFinal);
        fraseFinal = convertirO(fraseFinal);
        fraseFinal = convertirU(fraseFinal);

        System.out.println("La Frase Final quedo: " + fraseFinal);
    }
    
    public static String convertirA(String frase){
        
        String fraseAux = frase.replaceAll("a", "@");
        
        return fraseAux;
    }
    
    public static String convertirE(String frase){
        
        String fraseAux = frase.replaceAll("e", "#");
        
        return fraseAux;
    }
    
    public static String convertirI(String frase){
        
        String fraseAux = frase.replaceAll("i", "/");
        
        return fraseAux;
    }
    
    public static String convertirO(String frase){
        
        String fraseAux = frase.replaceAll("o", "%");
        
        return fraseAux;
    }
    
    public static String convertirU(String frase){
        
        String fraseAux = frase.replaceAll("u", "*");
        
        return fraseAux;
    }
}

//Ingresa: Ayer, lunes, salimos a las once y 10.