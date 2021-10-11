import java.util.Scanner;

public class Ejer24 {
    public static void main(String[] args) {
       
        System.out.println("A continuacion, tendrás que escribir tus notas");
        System.out.println("Escribe la nota, para finalizar tienes que pulsar -1: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int diez = 0;
        int positives = 0;
        while (num != -1){
            num = sc.nextInt();         
        }
        if (num == 10) {
            diez = diez +1;
         }else {
            System.out.println("No tienes dieces");
         }

        System.out.println("Tu nota media es de: " +  + " puntos.");
        System.out.println("Tienes: " + diez + " dieces." );
        
        sc.close();
    }
}
