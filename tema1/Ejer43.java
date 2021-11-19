import java.util.Scanner;

public class Ejer43 {
    public static void main(String[] args) {
        System.out.print("Escribe numero 1: ");
        Scanner sc = new Scanner(System.in);
        int dividendo = sc.nextInt();

        System.out.print("Escribe numero 2: ");
        int divisor = sc.nextInt();
        sc.close();


        while (dividendo >= divisor) {
            dividendo -= divisor;
        } 
            System.out.println(dividendo);
    }
}
