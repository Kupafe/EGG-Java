package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.print("Clasifique la peli de 1 a 5 estrellas: ");
        opinion = leer.nextInt();
        
        if(opinion >= 1 && opinion <= 5){
            
            switch (opinion){
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados que no hayas disfrutado la peli...");
                    break;
                case 3:
                    System.out.println("Has calificado la peli como buena.");
                    break;
                case 4:
                    System.out.println("Has calificado la peli como muy buena.");
                    break;
                case 5:
                     System.out.println("Fantastico que haya disfrutado un excelente entretenimiento!!");
                    break;
                    
                // El equivalente al caso *De Otro Modo* es el *default*
                // default:
                //    <acciones>
            }
        } else if (opinion < 0){
            System.out.println("¿Una opinion negativa? ¿Taaaaan mala fue la pelicula? :(");
        } else if (opinion == 0){
            System.out.println("El valor " + opinion + " no es valido y no se tomara en cuenta. :(");
        } else {
            System.out.println(opinion + "! Wow! Se te fue la mano con la calificacion! :D");
        }
        
        System.out.println("Hasta la proxima!");
        
    }
    
}
