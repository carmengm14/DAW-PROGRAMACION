import java.util.Scanner;

public class Ejer22 {
    public static void main(String[] args) {
        System.out.println("A continuacion, tendrás que escribir 10 numeros para saber cuales de ellos son positivos");

        System.out.print("Escribe un numero y dale al enter, asi hasta 10: ");
        Scanner sc = new Scanner(System.in);
        int num;

        int i = 0;
        while (i < 10){
            num = sc.nextInt();
            if (num >= 0) {
                System.out.println("Los numeros es positivo");
            } else {
                System.out.println("Los numeros es negativo");
            }
            i++;
        }
        sc.close();
    }
}
