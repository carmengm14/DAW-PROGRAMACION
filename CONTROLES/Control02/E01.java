import java.util.Scanner;
public class E01 {
    public static void main(String[] args) {
        System.out.print("Ingrese su nombre: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.next();

        System.out.println("Hola " + nombre);
    }
}
