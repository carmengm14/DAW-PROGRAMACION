import java.util.Scanner;

public class ejer1funcion { 
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Escribe un numero: ");
        int n1 = sc.nextInt();
        boolean n2 = true;
       
        while ((n1 > 0) && n2) {
            System.out.print("Escribe otro numero: ");
            n1 = sc.nextInt();
            if (n2 = false) {
                System.out.println("No se puede poner numeros no enteros");
            }
        }

       /* for (int i = 0; i > 0.0; i++) {
            System.out.println("Escribe otro numero: ");
        }
        */
        sc.close();
    }
}
