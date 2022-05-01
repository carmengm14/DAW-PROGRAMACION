import java.util.Scanner;

/**
 * Programa que lea un número entero N de X cifras y muestre sus cifras igual que en el ejemplo.
 * Por ejemplo para un número N = 12345   La salida debe ser:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 **/
public class EJERCICIO03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 0;

        System.out.print("Escribe un numero: ");
        numero = sc.nextInt();
        int numeroSinMod = numero;

       /*
        Este se usaria para recorrer todos los numeros hasta el que le hemos pasado por teclado y el 
        siguiente for lo que hace es enseñarlo de uno en uno añadiendose cada vez el consecuente atras:
        for (int i = 1; i <=numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        */

        while (numero != 0) {
            numero = numero / 10;
            ++contador;
        }
        if (contador > 5) {
            System.out.println("Numero no permitido");
        }else{
            System.out.println(numeroSinMod/10000);
            System.out.println(numeroSinMod/1000);
            System.out.println(numeroSinMod/100);
            System.out.println(numeroSinMod/10);
            System.out.println(numeroSinMod);
        }
       
        sc.close();
    }
}
