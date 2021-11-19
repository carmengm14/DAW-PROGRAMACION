import java.util.Scanner;

public class Ejer42 {
    public static void main(String[] args) {
        System.out.print("Escribe numero 1: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.print("Escribe numero 2: ");
        int y = sc.nextInt();
        sc.close();

        int mult = x;
        int i = 1;

        while (i < y) {
            mult += x;
            i += 1;
        } 
            System.out.println(mult);
    }
}