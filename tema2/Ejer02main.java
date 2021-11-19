import java.util.Scanner;
public class Ejer02main {
    
    public static void countdown (int n){
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.print("Escribe un numero: ");
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        sc.close();
       countdown(z);
    }
}
