/*
Una obra social tiene tres clases de socios:
o Los socios tipo ?A? abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ?B? abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ?C?, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
        String letra;
        int largo;
        double costoTratamiento, costoFinal;
        boolean letraSalida = false;
        
        do{
            
            do{

                System.out.print("\nIngrese la Categoria del Socio (A / B / C).\n"
                        + "Para finalizar presione la Letra D.\n"
                        + "Elija opcion: ");
                letra = leer.next().toUpperCase();

                largo = letra.length();

            }while(largo != 1);
            
            if (!letra.equalsIgnoreCase("D")){
                
                do{

                    System.out.print("\nIngrese el Costo del tratamiento Medico en Pesos: $");
                    costoTratamiento = leer.nextDouble();

                }while(costoTratamiento <= 0);
            
                
            
                switch(letra){

                    case "A":

                        System.out.print("Como usted abona $5000 Pesos por ser un Socio de Categoria A,\n"
                                + "y el tratamiento le cuesta $"+ costoTratamiento +" Pesos, tiene un\n"
                                + "descuento de 50% en el tratamiento, por el cual el Costo Final "
                                + "del mismo es de $");

                        costoFinal = (50 * costoTratamiento) / 100;
                        System.out.println(costoFinal +" Pesos.");
                        
                        break;

                    case "B":
                        
                        System.out.print("Como usted abona $3500 Pesos por ser un Socio de Categoria B,\n"
                                + "y el tratamiento le cuesta $"+ costoTratamiento +" Pesos, tiene un\n"
                                + "descuento de 35% en el tratamiento, por el cual el Costo Final "
                                + "del mismo es de $");

                        costoFinal = (35 * costoTratamiento) / 100;
                        costoFinal = costoTratamiento - costoFinal;
                        System.out.println(costoFinal +" Pesos.");
                        
                        break;

                    case "C":
                        
                        System.out.print("Como usted abona $2000 Pesos por ser un Socio de Categoria C,\n"
                                + "no tiene descuento para el tratamiento, por ende debe pagar por el mismo,"
                                + "la suma de $"+ costoTratamiento +" Pesos.");

                        break;
                }
                
            }else{
                
                System.out.println("Saliendo...");
            }

        }while(!letra.equals("D"));
        
        System.out.println("FIN DE LA EJECUCION DEL PROGRAMA.");
    }
    
}
