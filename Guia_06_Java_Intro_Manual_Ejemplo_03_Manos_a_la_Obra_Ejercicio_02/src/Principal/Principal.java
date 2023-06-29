/*
EJERCICIO 2
¿Recuerdas las variables que creaste en el ejercicio anterior? Ahora deberás asignarles un valor.

Ejercicio anterior:
Crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos tipos de datos.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("----- BIENVENIDOS. -----\n\n"
                + "En este programa se debe crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos tipos de datos.\n");
        /*
        byte: Es un entero con signo de 8 bits, el mínimo valor que se puede
        almacenar es -128 y el máximo valor es de 127 (inclusive).
        */
            
        byte biti;
        
        do{
            
            System.out.print("Ingrese un numero entre -128 y 127: ");
            biti = leer.nextByte();
            
        }while (biti < -128 && biti > 127);
        
        /*
        short Es un entero con signo de 16 bits. El valor mínimo es -32,768 y el
        valor máximo 32,767 (inclusive).
        */
        short shorti;
        
        do{
            
            System.out.print("Ingrese un numero entre -32768 y 32767: ");
            shorti = leer.nextShort();
            
        }while (shorti < -32768 && shorti > 32767);
        
        /*
        int: Es un entero con signo de 32 bits. El valor mínimo es
        -2,147,483,648 y el valor máximo es 2,147,483,64 (inclusive).
        Generalmente es la opción por defecto.
        */
        
        int inti;
        
        do{
            
            System.out.print("Ingrese un numero entre -2,147,483,648 y 2,147,483,64: ");
            inti = leer.nextInt();
            
        }while (inti < -2147483648 && inti > 214748364);
        
        /*
        long: Es un entero con signo de 64 bits, el valor mínimo que puede
        almacenar este tipo de dato es -9,223,372,036,854,775,808 y el máximo
        valor es 9,223,372,036,854,775,807 (inclusive).
        */
        
        long longi;
        
        do{
            
            System.out.print("Ingrese un numero entre -9,223,372,036,854,775,808 y 9,223,372,036,854,775,807: ");
            longi = leer.nextLong();
            
        }while (longi < -9223372036854775808.0 && longi > 9223372036854775807.0);
        
        /*
        float Es un número decimal de precisión simple de 32 bits (IEEE 754
        Punto Flotante).
        */
        
        float floti;
        
        System.out.print("Ingrese un numero decimal de precisión simple de 32 bits (IEEE 754 Punto Flotante): ");
        floti = leer.nextFloat();
            
        /*
        double Es un número decimal de precisión doble de 64 bits (IEEE 754
        Punto Flotante).
        */
        
        double doubli;
        
        System.out.print("Ingrese un numero decimal de precisión simple de 64 bits (IEEE 754 Punto Flotante): ");
        doubli = leer.nextDouble();

        /*
        boolean Este tipo de dato sólo soporta dos posibles valores: verdadero
        o falso y el dato es representado con tan solo un bit de información.
        */
        
        int numero;
        boolean booleani;
        
        do{
            
            System.out.print("Ingrese 0 o 1: ");
            numero = leer.nextInt();
            
        }while (numero != 0 && numero != 1);
        
        if (numero == 0){
            
            booleani = true;
            
        }else{
            
            booleani = false;
        }

        /*
        char: El tipo de dato carácter es un simple carácter unicode de 16 bits.
        Su valor mínimo es de '\u0000' (En entero es 0) y su valor máximo es de
        '\uffff' (En entero es 65,535).
        Nota: un dato de tipo carácter se puede escribir entre comillas simples,
        por ejemplo 'a', o también indicando su valor Unicode, por ejemplo
        '\u0061'.
        */
        
        char chari;
        
        System.out.print("Ingrese un caracter: ");
        chari = leer.next().charAt(0);
      
        /*
        String Además de los tipos de datos primitivos el lenguaje de
        programación Java provee también un soporte especial para cadena de
        caracteres a través de la clase String.
        Encerrando la cadena de caracteres con comillas dobles se creará de
        manera automática una nueva instancia de un objeto tipo String.
        String cadena = “Sebastián”;
        Los objetos String son inmutables, esto significa que una vez creados,
        sus valores no pueden ser cambiados. Si bien esta clase no es
        técnicamente un tipo de dato primitivo, el lenguaje le da un soporte
        especial y hace parecer como si lo fuera.
        */
        
        String strinti;
        
        System.out.print("Ingrese una letra, palabra o frase: ");
        strinti = leer.next();
        
        System.out.println("----- Los valores ingresados son: \n"
                + "\tByte: "+biti+".\n"
                + "\tShort: "+shorti+".\n"
                + "\tInt: "+inti+".\n"
                + "\tLong: "+longi+".\n"
                + "\tFloat: "+floti+".\n"
                + "\tDouble: "+doubli+".\n"
                + "\tBoolean: "+booleani+".\n"
                + "\tChar: "+chari+".\n"
                + "\tString: "+strinti+"."
        );

        System.out.println("\n----- FINALIZO LA EJECUCION DE PROGRAMA. -----");
    }
}