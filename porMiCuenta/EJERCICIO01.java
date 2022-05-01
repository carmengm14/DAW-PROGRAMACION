import java.util.Scanner;

/* Programa Java que lea un número entero por teclado y calcule si es par o impar. hazlo con un metodo a parte*/
public class EJERCICIO01 {
    public static void main(String[] args) {
        //variables y lectores
        Scanner sc = new Scanner(System.in);
        int numero;

        //leemos el numero
        System.out.print("Escribe un número: ");
        numero = sc.nextInt();
        
        //Llamada al metodo de comprobacion y filtramos el resultado
        if (parOimpar(numero) == true) {
            System.out.println(numero + ": Es Par");
        }else{
            System.out.println(numero + ": Es Impar");
        }
        sc.close();
    }
    //metodos
    public static boolean parOimpar(int numero){
        if (numero % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }
}
