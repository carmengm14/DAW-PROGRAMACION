package ACTIVIDADES;
import java.util.Scanner;

/* Primo.java Crea un método llamado esPrimo que devuelva un booleano para indicar si el número
pasado como parámetro es primo.*/
public class EJER06 {

    public static boolean esPrimo(int numero){
       System.out.println(numero);
       int divisor = 2;
         boolean esPrimo = true;

        while ((divisor < numero) && esPrimo) {
       
        if (numero % divisor == 0) {
         esPrimo = false;
         }
         divisor++;
        }

        if (esPrimo == true){
          System.out.print("Es primo por lo tanto: ");
        }else{
            System.out.print("No es primo por lo tanto: ");
        }
        return esPrimo;
    }

    public static void main(String[] args) {
        System.out.print("Escribe un numero: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();
        System.out.println(esPrimo(numero));
    }

}
