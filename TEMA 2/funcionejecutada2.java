import java.util.Scanner;

public class funcionejecutada2 {
    public static void main(String[] args) {
        System.out.print("Escribe un numero: ");
        Scanner sc = new Scanner (System.in);
        int numero = sc.nextInt();
        System.out.println(Entrada.getInteger(numero));
    sc.close();
    }
}
