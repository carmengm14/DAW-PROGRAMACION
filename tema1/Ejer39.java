import java.util.Scanner;
/* Realiza un programa que pida un número natural y escriba sus divisores.*/

public class Ejer39 {
   public static void main(String[] args) {
       System.out.print("Introduce un numero natural: ");
       Scanner sc = new Scanner(System.in);
       int numero = sc.nextInt();
       sc.close();
    
       for (int i = 1; i <= numero; i++) {
           if ((numero % i) == 0 ){
            System.out.print(i + " ");
           }
       }
       System.out.println(" ");
       
    }
}
