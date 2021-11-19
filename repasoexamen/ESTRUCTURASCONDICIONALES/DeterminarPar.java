package repasoexamen.ESTRUCTURASCONDICIONALES;

import java.util.Scanner;

/*Escriba un programa que determine si el número entero ingresado por el usuario es par o no.*/
public class DeterminarPar {
    public static void main(String[] args) {
        System.out.print("Escribe un numero: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();
        if (numero % 2 == 0) {
            System.out.println("Su numero es par");
        }else{
            System.out.println("Su numero es impar");
        }
    }
}