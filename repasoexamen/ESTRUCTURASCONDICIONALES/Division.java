package repasoexamen.ESTRUCTURASCONDICIONALES;
import java.util.Scanner;
/* Escriba un programa que pida dos números enteros y que calcule la división, indicando si la división es exacta o no. */

public class Division {
    public static void main(String[] args) {
        System.out.print("Dividendo: ");
        Scanner sc = new Scanner(System.in);
        int dividendo = sc.nextInt();

        System.out.print("Divisor: ");
        int divisor = sc.nextInt();
        sc.close();
        
        if (dividendo % divisor == 0) {
            System.out.println("La división es exacta.");
        }else{
            System.out.println("La división no es exacta.");
        }

        int cociente = dividendo / divisor ;
        int resto = dividendo % divisor ;

        System.out.println("Cociente: " + cociente);
        System.out.println("Resto: " + resto);

    }
}
