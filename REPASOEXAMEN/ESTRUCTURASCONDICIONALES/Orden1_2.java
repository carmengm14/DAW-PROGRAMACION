package ESTRUCTURASCONDICIONALES;

import java.util.Arrays;
import java.util.Scanner;


public class Orden1_2 {
    public static void main(String[] args) {
        System.out.print("Ingrese numero: ");
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
            Arrays.sort(numeros);                                                                 
            System.out.println(numeros + " ");
        }
        sc.close();     

    }
}
