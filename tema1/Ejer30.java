import java.util.Scanner;

public class Ejer30 {
    public static void main(String[] args) {

        boolean palindromo = true;

        System.out.print("Dime una palabra o frase para saber si es palíndromo: ");
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        sc.close();

        int tamaño = palabra.length();
        int limite = tamaño/2;
        
        for (int i = 0; i < limite; i++) {
            char caracter1 = palabra.charAt(i);
            char caracter2 = palabra.charAt(tamaño-1-i);
           
            if (caracter1 != caracter2){
                palindromo = false;
            }
        }
        if (palindromo) {
            System.out.println("Tu palabra: " + palabra + " es palindromo.");
        } else {
            System.out.println("Tu palabra: " + palabra + " no es palindromo.");
        }

    }
}
