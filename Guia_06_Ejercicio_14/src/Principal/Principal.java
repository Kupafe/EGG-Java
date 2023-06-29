/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
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
