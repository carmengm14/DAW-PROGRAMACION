package ACTIVIDADES;
/*  Mayor.java Realiza un programa que pida la edad al usuario y muestre un mensaje si es mayor de edad */
import java.util.Scanner;
public class Mayor {
    public static void MayorDeEdad(int edad) {
        if (edad >= 18) {
            System.out.println("Eres mayor de edad porque tienes: " + edad + " años");
        } else {
            System.out.println("Eres menor de edad porque tienes: " + edad + " años");
        }

    }
    public static void main(String[] args) {
       System.out.print("Dime tu edad: "); 
       Scanner sc = new Scanner(System.in);
       int edad = sc.nextInt();
       sc.close();
       MayorDeEdad(edad);
    }
}
