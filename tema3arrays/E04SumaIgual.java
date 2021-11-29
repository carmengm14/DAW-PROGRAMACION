/*Escribid un programa Java para encontrar todos los pares de elementos en un array cuya suma es igual a un número especificado por el usuario.*/
import java.util.Scanner;
public class E04SumaIgual {
    public static void main(String[] args) {
        System.out.print("Dime un numero: ");
        Scanner sc = new Scanner(System.in);
        int numUser = sc.nextInt();

        int suma;
        sc.close();

        for (int i = 0; i < numUser; i++) {
            for (int j = 1; j < numUser; j++) {
                suma = i + j;
                if (suma == numUser) {
                    System.out.println(i + " + " + j + " = " + suma);
                }
            }
        }
    }

}
