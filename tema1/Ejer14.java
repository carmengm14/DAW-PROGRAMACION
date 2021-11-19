import java.util.Scanner;

public class Ejer14 {
    public static void main(String args[]){
        
        System.out.print("Escribe la nota de tu examen: ");
        Scanner sc= new Scanner(System.in);
        int nota = sc.nextInt();
         
        if(nota<3) {
            System.out.println("Tu nota es Muy Deficiente");
        }else if(nota >= 3 && nota <= 5) {
            System.out.println("Tu nota es un Insuficiente");   
        }else if(nota >= 5 && nota <= 6) {
            System.out.println("Tu nota es un Suficiente"); 
        }else if(nota >= 6 && nota <= 7) {
            System.out.println("Tu nota es un Bien"); 
        }else if(nota >= 7 && nota <= 8) {
            System.out.println("Tu nota es un Notable");   
        }else if(nota >= 9 && nota <= 10) {
            System.out.println("Tu nota es un Sobresaliente, ¡Enhorabuena!");   
        }
        else {
            System.out.println("Tu nota no es valida, escribela del 1 al 10.");   
        }
        sc.close();
}
}
