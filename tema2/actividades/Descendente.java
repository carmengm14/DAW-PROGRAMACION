package tema2.actividades;

import java.util.Scanner;
/* . Descendente.java Realiza un programa que lea dos valores y los muestre en orden ascendente */

public class Descendente {

    public static void descendentes (int n1, int n2){
        System.out.println("El orden es:");
        if (n1>n2) {
            System.out.println(n1);
            System.out.println(n2);
        }else{
            System.out.println(n2);
            System.out.println(n1);
        }
    }
    public static void main(String[] args) {
        System.out.print("Escribe un numero: ");
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();

        System.out.print("Escribe otro numero: ");
        int numero2 = sc.nextInt();

        sc.close();
        descendentes(numero1, numero2);
    }
}