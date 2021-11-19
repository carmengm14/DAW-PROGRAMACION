import java.util.Scanner;

/* Positivos.java Escribe un programa que pida al usuario 10 números y que muestre cuántos son
positivos*/
public class Positivos {
    public static void NumerosPositivos(int[] numero){
        int positives = 0;

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] >= 0 ) {
                positives ++;
            }
        }
        
        System.out.println(positives);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10]; 

        for (int contador = 0; contador < 10; contador ++){
                System.out.print("Escribe un numero positivos o negativo: ");
                numeros[contador] = sc.nextInt();
        }

        NumerosPositivos(numeros);
        sc.close();
    }
}
