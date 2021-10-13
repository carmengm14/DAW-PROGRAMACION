import java.util.Scanner;

public class Ejer24 {
    public static void main(String[] args) {
       
        int contador = 0;
        double total = 0;
        int dieces = 0;
        System.out.println("A continuacion, tendrás que escribir tus notas");
        System.out.print("Escribe la nota, para finalizar tienes que pulsar -1: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
       while(num != -1){
            total += 1; //Cuántos
            contador += num; //Valores
            if(num == 10){
                dieces++;
            }
            System.out.print("Escribe la nota, para finalizar tienes que pulsar -1: ");
            num = sc.nextInt();
       } 

        System.out.println("Tu media es de: " + contador/total + " puntos.");

        if (dieces > 0) {
            System.out.println("Hay 1 o más dieces en tus notas");
        }else{
            System.out.println("No hay dieces en tus notas");
        }
        
        sc.close();
    }
}
