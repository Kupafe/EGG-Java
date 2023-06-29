/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter ?*?. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

            * * * *
            *     *
            *     *
            * * * *
 */

package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int tamano;
        
        do{
            
            System.out.print("Ingrese el tamaño del cuadrado. Siempre debe de ser un numero positivo: ");
            tamano = leer.nextInt();
        
        }while (tamano < 1);
        
        System.out.println("");
        
        for (int i = 0; i < tamano; i++) {
            
            for (int j = 0; j < tamano; j++) {

                if (i < 1 || j < 1 || i > tamano - 2 || j > tamano -2){
                    
                    System.out.print("* ");
                    
                }else{
                
                    System.out.print("  ");
                }
                
            }
            System.out.println("");
        }
            
            
      
        
        System.out.println("\n");
    }
    
}
