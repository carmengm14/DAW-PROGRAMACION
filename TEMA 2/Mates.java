import java.util.Scanner;

public class Mates {
    public static double suma(double n1, double n2) {
        System.out.print("Escribe un numero: ");
        Scanner sc= new Scanner(System.in);
        n1= sc.nextDouble();

        System.out.print("Escribe otro numero: ");
        n2= sc.nextDouble();
        sc.close();

        double suma= n1 + n2;
        return suma;
    }
}
