package ESTRUCTURASCONDICIONALES;
import java.util.Scanner;
public class Orden1 {
    public static void main(String[] args) {
        System.out.print("Ingrese numero: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.print("Ingrese numero: ");
        int num2 = sc.nextInt();

        sc.close();

        if (num1 > num2) {
            System.out.println(num2 + " " + num1);
        }else{
            System.out.println(num1 + " " + num2);
        }
    }
}
