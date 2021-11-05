import java.util.Scanner;
public class E08 {
    public static void main(String[] args) {
        System.out.print("Ingrese un numero: ");
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();
        sc.close();
		double parteDecimal = numero % 1;
		System.out.println(parteDecimal);
    }
}