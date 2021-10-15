import java.util.Scanner;

public class Ejer29 {
    public static void main(String[] args) {
        int divisor = 2;
        boolean esPrimo = true;

        System.out.println("Los numeros primos son: ");

        for (int i = 3; i <= 100; i++) {
            divisor = 2;
            esPrimo = true;
            while ((divisor < i) && esPrimo) {
            
            if (i % divisor == 0) {
                esPrimo = false;
            }
            divisor++;
            }

            if (esPrimo == true){
                System.out.println(i);
            }
        }
    }     
}
