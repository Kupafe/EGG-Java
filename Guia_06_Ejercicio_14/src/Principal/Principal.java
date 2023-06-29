/*
Crea una aplicaci�n que a trav�s de una funci�n nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a d�lares, yenes o libras. La
funci�n tendr� como par�metros, la cantidad de euros y la moneda a converir que ser�
una cadena, este no devolver� ning�n valor y mostrar� un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 ?
* 1.28611 $ es un 1 ?
* 129.852 yenes es un 1 ?
 */

package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String cadena;
        double euro, dolar, yen, libra;
        
        System.out.println(" ----- BIENVENIDOS -----\n\n"
                + "Sistema de conversion de divisas.");

        do{
            
            System.out.print("Ingrese el monto de Euros a convertir: ");
            cadena = leer.next();
            
            euro = Double.parseDouble(cadena);
            
        }while(euro < 0);
           
        dolar = euro * 1.28611;
        yen = euro * 129.852;
        libra = euro * 0.86;
        
        System.out.println("El monto de "+ euro + " Euros convertidos a:\n\n"
                + "\tDOLARES son: "+ dolar +" Dolares.\n"
                + "\tYENES son: "+ yen +" Yenes.\n"
                + "\tLIBRAS: "+ libra +" Libras.\n\n"
                + "FIN DE LA EJECUCION DEL PROGRAMA.\n");
    }
}
