import java.util.Scanner;

public class Ejer27 {
    public static void main(String[] args) {
      System.out.print("Escribe un numero entero: ");  
      Scanner sc = new Scanner(System.in);
      int numero = sc.nextInt();

      int nums = 0;

     do {
         System.out.println(nums);
        nums ++;
     } while (numero > 0 || nums <= numero);
    }
}
