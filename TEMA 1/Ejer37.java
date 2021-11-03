import java.util.Scanner;

public class Ejer37 {
    public static void main(String[] args) {
        double[] numeros = new double[10];
        Scanner sc = new Scanner(System.in);
       
        double max;
        double min;

        System.out.println("Escribe un numero: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextDouble();
        }
       
        max = numeros[0];
        min = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        System.out.println("Numero max: " + max + " y numero min: " + min);
        sc.close();
    }
}
