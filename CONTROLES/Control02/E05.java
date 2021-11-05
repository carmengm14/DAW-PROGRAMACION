import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
    
        System.out.print("Ingrese numero: ");
        Scanner sc = new Scanner (System.in);
        String numero = sc.next();
        sc.close();
 
        int numeroentero;
        for (int i = 0; i <= 100; i++) {
            char caracter1 = numero.charAt(i);
            numero = Integer.parseInt(numeroentero);
            System.out.println(numeroentero-1);
        }
      }
    }