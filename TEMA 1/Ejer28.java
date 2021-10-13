import java.util.Scanner;

public class Ejer28 {
    public static void main(String[] args) {
        System.out.print("Escribe el número que quieres saber si es primo o no: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

      while (numero % numero == 0) {
          System.out.println(numero + " es primo.");
      }

    }
}
