import java.util.Scanner;

public class Ejer28 {
  public static void main(String[] args) {
    System.out.print("Escribe un numero para saber si es primo: ");
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
    int divisor = 2;
    boolean esPrimo = true;

    while ((divisor < numero) && esPrimo) {
       
      if (numero % divisor == 0) {
        esPrimo = false;
      }
      divisor++;
    }

    if (esPrimo == true){
      System.out.println("Es primo");
    }else{
      System.out.println("No es primo");
    }
  }
}
  
  
 /*   while (divisor < numero && esPrimo) {
    System.out.println(numero +"/"+ divisor + " = " +numero + " no es primo.");
    divisor++;        
  }   
  if (numero % divisor != 0) {

    System.out.println(numero +"/"+ divisor + " = " +numero + " es primo.");
  }
  */

