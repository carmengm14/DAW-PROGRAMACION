import java.util.Scanner;


public class Ejer27 {
    public static void main(String[] args) {
      System.out.print("Escribe un numero entero: ");  
      Scanner sc = new Scanner(System.in);
      int numero = sc.nextInt();
      sc.close();
      
      for(int i = 1; i <= numero; i++){
        for (int j=1;j<=i;j++) {
            System.out.print(j + "");
        }
        System.out.println("");
        }
}
}

