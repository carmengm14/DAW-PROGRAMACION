import java.util.Scanner;

public class Ejer28 {
    public static void main(String[] args) {
        System.out.print("Escribe el número que quieres saber si es primo o no: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int divisor = 2;

      while (numero % divisor == 0) {
          System.out.println(numero +"/"+ divisor + " = " +numero + " es primo.");
          divisor++;
      }   
      if (numero % divisor != 0) {
        System.out.println(numero +"/"+ divisor + " = " +numero + " es compuesto.");
      }
      
      
    }
}
