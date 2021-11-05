import java.util.Scanner;
public class E04 {
    public static void main(String[] args) {
        System.out.print("Ingrese longitud: ");
        Scanner sc = new Scanner(System.in);
        double longitud = sc.nextDouble();
        System.out.println(longitud + " cm = " + longitud/2.54 + " in");

    }
}
