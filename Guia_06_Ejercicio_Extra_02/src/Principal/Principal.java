/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package Principal;

public class Principal {

    public static void main(String[] args) {

        int A, B, C, D, aux;
        
        A = 37;
        B = 55;
        C = 16;
        D = 21;
        
        System.out.println("\nVALORES ANTES DEL INTERCAMBIO.\n\n"
                + "\tValor A: "+ A +".\n"
                + "\tValor B: "+ B +".\n"
                + "\tValor C: "+ C +".\n"
                + "\tValor D: "+ D +".\n");
        
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("VALORES DESPUES DEL INTERCAMBIO.\n\n"
                + "\tValor A: "+ A +".\n"
                + "\tValor B: "+ B +".\n"
                + "\tValor C: "+ C +".\n"
                + "\tValor D: "+ D +".\n");
    }
    
}
