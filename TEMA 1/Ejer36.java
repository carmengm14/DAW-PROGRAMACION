import java.util.Scanner;

public class Ejer36 {
    public static void main(String[] args) {
        double[] numeros = new double[10];
        Scanner sc = new Scanner(System.in);
        double max;

        System.out.println("Escribe un numero: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextDouble();
        }
       
        max = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            
        }
        System.out.println("Numero max: " + max );
        sc.close();
    }
}
