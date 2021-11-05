import java.util.Scanner;
public class E07 {
    public static void main(String[] args) {
        System.out.print("Hora actual: ");
        Scanner sc = new Scanner(System.in);
        int horaactual = sc.nextInt();

        System.out.print("Cantidad de horas: ");
        int horassumar = sc.nextInt();

        int calculo = (horassumar * 24 ) % horaactual;

        sc.close();

        System.out.println("En " + horassumar + " horas, el reloj marcara las " + calculo);
    }
}
