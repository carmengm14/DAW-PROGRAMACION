package borrar;

import java.util.Scanner;

public class TestMcd {
    public static void main(String[] args) {
        System.out.print("Escribe un divisor: ");
        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();

        System.out.print("Escribe un dividendo: ");
        int dividendo = sc.nextInt();
        
        sc.close();
        Mcd calculo = new Mcd(dividendo, divisor);
        //Mcd.calculoMcd(dividendo, divisor);
        System.out.println("El MCD es: " + calculo.calculoMcd());
    }
}
