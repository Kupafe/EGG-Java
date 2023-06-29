package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        int num;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese un numero entero positivo");
            num = leer.nextInt();
            if (num > 1000){
                System.out.println("Este programa podria tardar, ¿esta seguro? (s/n)");
                String confirma = leer.next();
                if (confirma.equals("s")){
                    break;      
                    // break: detiene el bucle y continua con el proximo bloque
                }
            }
        }while (num <= 0 || num > 1000);
        
        /*
        for (<inicializacion; <expresion_terminacion>; <paso/incremento/decremento> {
            <sentencias>
        */
        
        int j, suma;
        for (int i = 1; i <= num; i++) {
            
            if (i%2 != 0)
                continue;
                // continue: detiene la iteracion actual y salta a la siguiente
            
            suma = 0;
            j= 1;
            while(j <= i){
                suma+= j;
                j++;
            }
              
            System.out.println("La suma de los "+ i +" numeros naturales es: "+ suma);;
        }
    }
}
