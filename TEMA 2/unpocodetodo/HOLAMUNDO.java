package unpocodetodo;

import java.util.Scanner;
public class HOLAMUNDO {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
    sc.close();
   for (int i = 0; i < numero; i++) {
       System.out.println("Hola mundo.");
   }
}
    
}