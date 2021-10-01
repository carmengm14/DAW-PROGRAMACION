import java.util.Scanner;
import java.util.function.IntFunction;

public class Ejer13 {
    public static void main(String args[]) {

        System.out.print("Escribe un número: ");
        Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();

        System.out.print("Escribe otro número: ");
        int n2 = sc.nextInt();
        
        System.out.print("Escribe A si prefieres el orden de tus números en ascendente o  B para descendente: ");
        int opcion = sc.nextInt();
        
        if (n1>n2) {
            System.out.println(n2);
            System.out.println(n1);
        } else {
            System.out.println(n1);
            System.out.println(n2);
        }


        sc.close();
    }
    
}