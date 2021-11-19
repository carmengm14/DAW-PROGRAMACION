import java.util.Scanner;
public class Ejer01main {
    public static void main(String[] args) {
        System.out.print("Escribe un numero: ");
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        sc.close();
        if (Ejer01funcion.IsSingleDigit(z)) {
            System.out.println(z + " Es pequeño");
        }else{
            System.out.println(z + " Es grande");
        }
    }
}
