import java.util.Scanner;

	public class Ejer6{
		public static void main(String args[]){

	System.out.print("Escribe el radio de tu circunferencia: ");
	Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();

	System.out.println("Tu área es: " + (n1*3.14*n1));
	System.out.println("Tu perímetro es: " + (n1*3.14*2));
	sc.close();
}
}
