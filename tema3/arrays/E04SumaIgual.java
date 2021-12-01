/*Escribid un programa Java para encontrar todos los pares de elementos en un array cuya suma es igual a un número especificado por el usuario.*/
import java.util.Scanner;
public class E04SumaIgual {
    public static void main(String[] args) {
        int[] vector = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Dime un numero: ");
        Scanner sc = new Scanner(System.in);
        int numUser = sc.nextInt();

        int suma;
        sc.close();

        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                suma = vector[i] + vector[j];
                if (suma == numUser) {
                    System.out.println(vector[i] + " + " + vector[j] + " = " + suma);
                }
            }
        }
    }

}
//sin un vector, con todos los nums.
/*public static void main(String[] args) {
        System.out.print("Dime un numero: ");
        Scanner sc = new Scanner(System.in);
        int numUser = sc.nextInt();

        int suma;
        sc.close();

        for (int i = 0; i < numUser; i++) {
            for (int j = i + 1; j < numUser; j++) {
                suma = i + j;
                if (suma == numUser) {
                    System.out.println(i + " + " + j + " = " + suma);
                }
            }
        }
    }*/
