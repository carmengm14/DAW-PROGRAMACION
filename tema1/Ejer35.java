import java.util.Scanner;
public class Ejer35 {
    public static void main(String[] args) {

       int[] numeros = new int[10];
       Scanner sc = new Scanner(System.in);
       double total = 0;
       boolean hayDiez = false;

       System.out.println("Escribe un numero: ");
       for (int i = 0; i < numeros.length; i++) {  
        numeros[i] = sc.nextInt();

          total += numeros[i];

           if (numeros[i] == 10) {
               hayDiez = true;
           }
       }
       if (hayDiez == true) {
        System.out.println("Hay dieces en tus notas");
       }
       System.out.println("Tu media es: " + total/10);
    sc.close();
    }

    
}
