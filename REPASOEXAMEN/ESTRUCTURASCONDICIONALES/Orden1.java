package ESTRUCTURASCONDICIONALES;
import java.util.Arrays;
import java.util.Scanner;
public class Orden1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] numeros = new int[2];
            
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingrese numero: ");
                numeros[i] = sc.nextInt();                                                                 
            }
            Arrays.sort(numeros);
            System.out.println(Arrays.toString(numeros) + " ");
            sc.close();     
    
           }
}