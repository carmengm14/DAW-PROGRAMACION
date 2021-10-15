import java.util.Scanner;

public class Ejer27 {
    public static void main(String[] args) {
      System.out.print("Escribe un numero entero: ");  
      Scanner sc = new Scanner(System.in);
      int numero = sc.nextInt();
      sc.close();
      int i = 1;
      
      for(i = 1; i <= numero; i++){
        System.out.print(i);
        
          }
      }
}

