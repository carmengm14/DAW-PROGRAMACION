import java.util.Scanner;

public class Ejer04funmain {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int recurse = factorial(n - 1);
        int result = n * recurse;
        return result;
    }
    public static void main(String[] args) {
        System.out.print("Escribe un numero: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        factorial(n);
    }
}
