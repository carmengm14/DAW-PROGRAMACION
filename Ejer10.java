import java.util.Scanner;

public class Ejer10 {
    public static void main(String args[]) {
        System.out.print("Escribe cualquier número para saber si es + o -: ");
        Scanner sc = new Scanner (System.in);
        int numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("El número " + numero + " es positivo");
        } else {
            System.out.println("El número " + numero + " es negativo");
        }

        sc.close();
    }
}
