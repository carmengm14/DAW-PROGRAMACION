package ESTRUCTURASCONDICIONALES;
/*Escriba un programa que determine si un caracter ingresado es letra, número,
 o ninguno de los dos. En caso que sea letra, determine si es mayúscula o minúscula.*/
import java.util.Scanner;

public class Letra_o_Num {
    public static void main(String[] args) {
        System.out.print("Ingrese caracter: ");
        Scanner sc = new Scanner(System.in);
        char caracter = sc.nextLine().charAt(0);
        sc.close();
        
        if (Character.isDigit(caracter)) {
            System.out.println("Es un número");
        } else if (Character.isUpperCase(caracter)) {
            System.out.println("Es una letra mayuscula");
        }else if (Character.isLowerCase(caracter)) {
            System.out.println("Es una letra minuscula");
        }else {
            System.out.println("No es letra ni numero.");
        }
    }
}
