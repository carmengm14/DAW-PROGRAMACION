import java.util.Scanner;

public class Entrada { 
    public static int getInteger(int numero) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Escribe un numero: ");
        numero = sc.nextInt();
        boolean n2 = true;
        while ((numero >= 0) && n2) {
            System.out.print("Escribe otro numero: ");
            numero = sc.nextInt();
            if (n2 == false) {
                System.out.println("No se puede poner numeros no enteros");
            }
        }
        sc.close();
    }
}
