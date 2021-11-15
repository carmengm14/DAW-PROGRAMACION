package ACTIVIDADES;
/* Potencia.java  Escribe un método recursivo llamado  potencia  que toma un doble x y un entero n y
devuelve x^n.  */
import java.util.Scanner;

public class EJER03 {
    public static double potencia(double x, int n){
        // double potencia = Math.pow(x, n);
        if (n == 0) {
            return 1;
        } else {
            return (x * potencia(x, n-1));
        }
        //return potencia;
    }

    public static void main(String[] args) {
        System.out.print("Escribe un numero: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        System.out.print("Escribe la potencia: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(potencia(x, n));
    }
}
