/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial ?&&&&&? marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */

package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        boolean esX, esO;
        
        String cadena, letra;
        int largo, correcto, incorrecto;
        
        correcto = 0;
        incorrecto = 0;
        
        do{
            
            do{
            
                System.out.print("Ingrese una cadena de 5 caracteres, para finalizar ingrese la secuencia FDE (&&&&&): ");
                cadena = leer.next();
            
                largo = cadena.length();
                
                if(cadena.equals("&&&&&")){
                    
                    break;
                }
            
            }while(largo != 5);
        
            // substring(int beginIndex, int endIndex)
            letra = cadena.substring(0, 1);

            if (letra.equals("X")){

                esX = true;

            }else{

                esX = false;
            }

            letra = cadena.substring(largo - 1, largo);

            if (letra.equals("O")){

                esO = true;

            }else{

                esO = false;
            }

            if (esX == true && esO == true){

                System.out.println("SI es un dispositivo RS232");
                correcto++;

            }else{

                System.out.println("NO es un dispositivo RS232");
                incorrecto++;
            }
        
        } while(!cadena.equals("&&&&&"));
        
        System.out.println("La cantidad de Dispositivos Correectos ingresados son: "+ correcto +" veces.\n"
                + "La cantidad de Dispositivos Inorreectos ingresados son: "+ incorrecto +" veces.");
        
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.");
    }
}
