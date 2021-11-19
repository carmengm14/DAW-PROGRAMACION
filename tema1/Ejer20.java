import java.util.Scanner;

public class Ejer20 {
    public static void main(String[] args) {
        
        System.out.print("Escribe el precio de tu producto: ");
        Scanner sc = new Scanner (System.in);
        double precio = sc.nextDouble();

        double descuento5 = precio * 0.05;
        double descuento10 = precio * 0.10;

        if (precio < 6) {
            System.out.println("No se te aplica ningun descuento por lo que el precio es: " + precio + "€");
        } else if (precio >= 6 && precio < 60) {
            System.out.println("Se te aplica un descuento del 5% por lo que el precio es: " + descuento5 + "€");
        } else{
            System.out.println("Se te aplica un descuento del 10% por lo que el precio es: " + descuento10 + "€");
        }
        
        sc.close();
    }
}
