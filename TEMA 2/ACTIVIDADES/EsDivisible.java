package ACTIVIDADES;
/* EsDivisible.java  Escribe un método llamado  esDivisible  que toma dos enteros, n y m, y devuelve
verdadero si n es divisible por m, y falso en caso contrario. */
import java.util.Scanner;
public class EsDivisible {
    
    public static boolean esDivisible(int n, int m){
        if (n % m == 0 ) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.print("Escribe un numero: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Escribe otro numero: ");
        int m = sc.nextInt();
        sc.close();
        
        if (esDivisible(n, m)) {
            System.out.println(n + "/" + m + " es divisible");
        }else{
            System.out.println(n + "/" + m + " no es divisible");
        }
    }
}