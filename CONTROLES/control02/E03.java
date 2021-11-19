package CONTROLES.control02;
import java.util.Scanner;
public class E03 {
    public static void main(String[] args) {
        System.out.print("Primera nota: ");
        Scanner sc = new Scanner(System.in);
        Double nota1 = sc.nextDouble();
        
        System.out.print("Segunda nota: ");
        Double nota2 = sc.nextDouble();

        System.out.print("Tercera nota: ");
        Double nota3 = sc.nextDouble();

        System.out.print("Cuarta nota: ");
        Double nota4 = sc.nextDouble();

        System.out.println("El promedio es: " + (nota1 + nota2 + nota3 + nota4)/4);
        sc.close();
    }
}