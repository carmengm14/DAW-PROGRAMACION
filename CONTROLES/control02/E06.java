package CONTROLES.control02;
import java.util.Scanner;
public class E06 {
    public static void main(String[] args) {
        System.out.print("Ingrese cateto a: ");
        Scanner sc = new Scanner(System.in);
        double catetoa = sc.nextDouble();

        System.out.print("Ingrese cateto b: ");
        double catetob = sc.nextDouble();
        double resultado = (catetoa*catetoa) + (catetob * catetob);

        System.out.println("La hipotenusa es " + Math.sqrt(resultado));
        sc.close();
    }
}
