import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
    
        System.out.print("Ingrese numero: ");
        Scanner sc = new Scanner (System.in);
        String numero = sc.next();
        sc.close();
        char[] aux = new char[numero.length()];
        System.out.print("Cadena aux: " + aux);
        
 
        int numeroentero;
        int tamaño = numero.length();
        for (int i = 0; i < tamaño/2; i++) {
            char caracter1 = numero.charAt(i);
            char caracter2 = numero.charAt(tamaño-i-1);
            aux[i] = caracter2;
            aux[tamaño-i-1] = caracter1;
            System.out.println(numeroentero-1);
        }

        System.out.print("Resultado: " + aux.toString());
      }
    }