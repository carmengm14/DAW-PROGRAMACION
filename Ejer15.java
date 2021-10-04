import java.util.Scanner;
   
public class Ejer15 {
        public static void main(String args[]){
            System.out.print("Escribe un número del 1 al 10: ");
            Scanner sc = new Scanner (System.in);
            int numero = sc.nextInt();

            if (numero == 1) {
                System.out.println("El 1 se escibe: uno");
            }else if (numero == 2){
                System.out.println("El 2 se escibe: dos");
            }else if (numero == 3){
                System.out.println("El 3 se escibe: tres");
            }else if (numero == 4){
                System.out.println("El 4 se escibe: cuatro");
            }else if (numero == 5){
                System.out.println("El 5 se escibe: cinco");
            }else if (numero == 6){
                System.out.println("El 6 se escibe: seis");
            }else if (numero == 7){
                System.out.println("El 7 se escibe: siete");
            }else if (numero == 8){
                System.out.println("El 8 se escibe: ocho");
            }else if (numero == 9){
                System.out.println("El 9 se escibe: nueve");
            }else if (numero == 10){
                System.out.println("El 10 se escibe: diez");
            }
        }

}
