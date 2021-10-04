import java.util.Scanner;
import java.util.function.IntFunction;

public class Ejer13 {
    public static void main(String args[]) {

        System.out.print("Escribe un número: ");
        Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();

        System.out.print("Escribe otro número: ");
        int n2 = sc.nextInt();
        
        System.out.print("Escribe A si prefieres el orden de tus números en ascendente o  D para descendente: ");
        String orden = sc.next();
        
        if (orden.equals ("A"))  {
            System.out.println("n1: " + n1);
            System.out.println("n2: " + n2);
        } else if (orden.equals ("D")){
            System.out.println("n2: " + n2);
            System.out.println("n1: " + n1);
        } else{
            System.out.println("No has indicado bien el orden");
        }


        sc.close();
    }
    
}