import java.util.Scanner;
public class Ejer05funmain {
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }else{
        return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        System.out.print("Escribe un numero: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(fibonacci(n));
    }
}
