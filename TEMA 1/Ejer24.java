import java.util.Scanner;

public class Ejer24 {
    public static void main(String[] args) {
       
        System.out.println("A continuacion, tendrás que escribir tus notas");
        System.out.println("Escribe la nota, para finalizar tienes que pulsar -1: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int contador = 0;
        double total = 0;
        
        do{
            total = total +1;
            contador ++;
        } while (num !=-1);

        System.out.print("Tu media es de: " + total/contador + " puntos.");

        if (num == 10) {
            System.out.println("Hay 1 o más dieces en tus notas");
        }else{
            System.out.println("No hay dieces en tus notas");
        }
        
        sc.close();
    }
}
