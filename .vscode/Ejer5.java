import java.util.Scanner;

public class Ejer5{
	public static void main(String args[]){
		System.out.print("Introduce el 1º dígito: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		System.out.print("Introduce el 2º dígito: ");
		int n2 = sc.nextInt();
		
		System.out.println("La suma de los dos dígitos es: " + (n1+n2));
		System.out.println("La resta de los dos dígitos es: " + (n1-n2));
		System.out.println("La multiplicación de los dos dígitos es: " + (n1*n2));
		System.out.println("La división de los dos dígitos es: " + (n1/n2));
		sc.close();

	}
}
