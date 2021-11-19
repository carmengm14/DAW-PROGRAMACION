import java.util.Scanner;

public class Ejer23 {
    public static void main(String[] args) {
       
        System.out.println("A continuacion, tendrás que escribir numeros para saber cuales de ellos son positivos");
        System.out.println("Escribe un numero y dale al enter, para finalizar tienes que pulsar 0: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int positives = 0;
        while (num != 0){
            num = sc.nextInt();
            if (num >= 0) {
               positives = positives +1;
            } 
            
        }
        System.out.println("Hay " + positives + " numeros positivos");
        sc.close();
    }
}
