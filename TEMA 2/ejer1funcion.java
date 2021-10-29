import java.util.Scanner;

public class ejer1funcion { 
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Escribe un numero: ");
        int numero = sc.nextInt();
        boolean n2 = true;
       
        while ((numero >= 0) && n2) {
            System.out.print("Escribe otro numero: ");
            numero = sc.nextInt();
            if (n2 == false) {
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
