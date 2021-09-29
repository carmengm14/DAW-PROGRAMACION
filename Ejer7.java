import java.util.Scanner;
	public class Ejer7{
	public static void main(String args[]){
		System.out.print("Inserta el precio NORMAL de tu producto: ");
		Scanner sc = new Scanner(System.in);
		double PrecioNormal = sc.nextDouble();

		System.out.print("Inserta el precio REBAJADO de tu producto: ");
		double PrecioRebajado = sc.nextDouble();

		double Descuento = ((PrecioNormal-PrecioRebajado)/PrecioNormal*100);


		System.out.println("Te han aplicado un descuento del: " + Descuento + "%" );
}
}
