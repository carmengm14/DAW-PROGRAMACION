import java.util.Scanner;

public class Ejer11 {
    public static void main(String args[]) {
        System.out.print("Escribe un número: ");
        Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();

        System.out.print("Escribe otro número: ");
        int n2 = sc.nextInt();

        System.out.println("El orden ascente de tus números es: ");
        if (n1>n2) {
            System.out.println(n2);
            System.out.println(n1);
        } else {
            System.out.println(n1);
            System.out.println(n2);
        }
        sc.close();
    }
    
}
