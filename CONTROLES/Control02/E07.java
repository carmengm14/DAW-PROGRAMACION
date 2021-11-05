import java.util.Scanner;
public class E07 {
    public static void main(String[] args) {
        System.out.print("Hora actual: ");
        Scanner sc = new Scanner(System.in);
        double horaactual = sc.nextDouble();

        System.out.print("Cantidad de horas: ");
        double horassumar = sc.nextDouble();

        sc.close();
    }
}
