import java.util.Scanner;

public class Ej4{
	public static void main(String args[]){
		System.out.print("Introduce el 1º dígito: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		System.out.print("Introduce el 2º dígito: ");
		int n2 = sc.nextInt();
		
		System.out.println("El resultado del área de tu cuadrado es: " + (n1*n2));
		sc.close();
	}
}
