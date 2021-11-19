package CONTROLES.control02;
import java.util.Scanner;
public class E02 {
    public static void main(String[] args) {
        System.out.print("Ingrese el radio: ");
        Scanner sc = new Scanner(System.in);
        Double radio = sc.nextDouble();

        System.out.println("Perimetro: " + 2*Math.PI*radio);
        System.out.println("Área: " + Math.PI*radio*radio);  
        sc.close();
    }
}
