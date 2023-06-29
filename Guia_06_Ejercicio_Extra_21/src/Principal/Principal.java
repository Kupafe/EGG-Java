/*
Los profesores del curso de programación de Egg necesitan llevar un registro de
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones
de cada nota son:
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al
final del programa los profesores necesitan obtener por pantalla la cantidad de
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con
promedio mayor o igual al 7 de sus notas del curso.
 */
package Principal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde

        String[] nombreApellido = new String[10];
        int[] primerTrabajoPracticoEvaluativo = new int[10];
        int[] segundoTrabajoPracticoEvaluativo = new int[10];
        int[] primerIntegrador = new int[10];
        int[] segundoIntegrador = new int[10];
        int[] promedio = new int[10];
        
        int nota;
        
        int resultadoPrimerTrabajoPracticoEvaluativo, resultadoSegundoTrabajoPracticoEvaluativo;
        int resultadoPrimerIntegrador, resultadoSegundoIntegrador;
        
        for (int i = 0; i < 10; i++) {
            
            System.out.print("Ingrese el Nombre y Apellido del alumno: ");
            nombreApellido[i] = leer.next();
            
            do{
                
                System.out.print("Ingrese la Nota del Primer Trabajo Practico Evaluativo correspondiente a el alumno "+ nombreApellido[i] +" (Puntuar del 1 al 100): ");
                
                nota = leer.nextInt();
            
            }while(nota < 1 || nota > 100);
            
            primerTrabajoPracticoEvaluativo[i] = nota;
            
            System.out.println("Nota primerTrabajoPracticoEvaluativo: "+ primerTrabajoPracticoEvaluativo[i]);
            
            resultadoPrimerTrabajoPracticoEvaluativo = promedio(primerTrabajoPracticoEvaluativo, 10, i);
            
            System.out.println("Resultado primerTrabajoPracticoEvaluativo: "+ resultadoPrimerTrabajoPracticoEvaluativo);
            
            do{
                
                System.out.print("Ingrese la Nota del Segundo Trabajo Practico Evaluativo correspondiente a el alumno "+ nombreApellido[i] +" (Puntuar del 1 al 100): ");
                
                nota = leer.nextInt();
            
            }while(nota < 1 || nota > 100);
                
            segundoTrabajoPracticoEvaluativo[i] = nota;
            
            System.out.println("Nota segundoTrabajoPracticoEvaluativo: "+ segundoTrabajoPracticoEvaluativo[i]);
            
            resultadoSegundoTrabajoPracticoEvaluativo = promedio(segundoTrabajoPracticoEvaluativo, 15, i);
            
            System.out.println("Resultado segundoTrabajoPracticoEvaluativo: "+ resultadoSegundoTrabajoPracticoEvaluativo);
            
            do{
                
                System.out.print("Ingrese la Nota del Primer Integrador correspondiente a el alumno "+ nombreApellido[i] +" (Puntuar del 1 al 100): ");
                nota = leer.nextInt();
            
            }while(nota < 1 || nota > 100);
            
            primerIntegrador[i] = nota;
            
            System.out.println("Nota primer integrador: "+ primerIntegrador[i]);
            
            resultadoPrimerIntegrador = promedio(primerIntegrador, 25, i);
             
            System.out.println("Resultado primerIntegrador: "+ resultadoPrimerIntegrador);
            
            do{
                
                System.out.print("Ingrese la Nota del Segundo Integrador correspondiente a el alumno "+ nombreApellido[i] +" (Puntuar del 1 al 100): ");
                nota = leer.nextInt();
            
            }while(nota < 1 || nota > 100);
            
            segundoIntegrador[i] = nota;
            
            System.out.println("NotasegundoIntegrador: "+ segundoIntegrador[i]);
            
            resultadoSegundoIntegrador = promedio(segundoIntegrador, 50, i);
            
            System.out.println("Resultado segundoIntegrador: "+ resultadoSegundoIntegrador);
            
            promedio[i] = (resultadoPrimerTrabajoPracticoEvaluativo + resultadoSegundoTrabajoPracticoEvaluativo + resultadoPrimerIntegrador + resultadoSegundoIntegrador);
            System.out.println("Promedio: "+ promedio[i]);
            
            mostrarPromedio(nombreApellido, promedio, i);
        }
    }
    
    public static int promedio(int[] vector, int porcentaje, int posicion){
        
        return (porcentaje * vector[posicion]) / 100;
    }
    
    public static void mostrarPromedio(String[] nombreApellido, int[] promedio, int posicion){
            
        if (promedio[posicion] >= 70){

            System.out.println("El promedio del alumno "+ nombreApellido[posicion] +" es de "+ promedio[posicion] +" puntos, por lo cual SI esta APROBADO.");

        }else{

            System.out.println("El promedio del alumno "+ nombreApellido[posicion] +" es de "+ promedio[posicion] +" puntos, por lo cual NO esta APROBADO.");
        }
    }
}