/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package Principal;

public class Principal {

    public static void main(String[] args) {

        String vectorA[] = new String[1000];
        String vectorB[] = new String[1000];

        for(int i = 0; i < 1000; i++){
        
            vectorA[i] = Integer.toString(i);
            vectorB[i] = Integer.toString(i).replace("3", "E");
        }

        for(int i = 0; i < 1000; i++){
        
            if (vectorB[i].length() == 1) {
            
                System.out.println("El numero sin modificar es 00"+ vectorA[i]);
                System.out.println("El numero modificado es 00"+ vectorB[i]);
                System.out.println("\n------------------------------------\n");
            
            }else if (vectorA[i].length()==2) {
                
                //System.out.println("0"+vectorA[i]);
                
                System.out.println("El numero sin modificar es 0"+ vectorA[i]);
                System.out.println("El numero modificado es 0"+ vectorB[i]);
                System.out.println("\n------------------------------------\n");
            
            }else{
            
                //System.out.println(vectorA[i]);
                
                System.out.println("El numero sin modificar es "+ vectorA[i]);
                System.out.println("El numero modificado es "+ vectorB[i]);
                System.out.println("\n------------------------------------\n");
            }
        }
    }
}