package Principal;

//import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        /*
        Error
        int acumulador;
        */
        
        int acumulador = 0;
        
        for (int i = 0; i < 10; i++) {
            
            /*
            Error
            acumulador = acumulador;
            */
            acumulador = acumulador + i;
        }
        
        System.out.println("Acumulador: "+ acumulador);
    }
    
    public static double suma(int a, int b){
        
        // Logica
        /*
        Error
        int c = a + b;
        */
        double c = a + b;
        return c;
    }
    
    public static void saludoPersonalizado(String nombre){
        
        System.out.println("Hola "+ nombre + ", ¿como estas?");
    }
}
