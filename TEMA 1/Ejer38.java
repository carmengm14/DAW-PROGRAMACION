import java.util.Scanner;

public class Ejer38 {
    public static void main(String[] args) {

        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        System.out.print("Dime una palabra: ");
        Scanner sc = new Scanner(System.in);
        String palabra = sc.next();
        sc.close();

        int tamaño = palabra.length();
        int limite = tamaño;

        for (int i = 0; i < limite; i++) {
            int total;
            char caracter = palabra.charAt(i);
            if (caracter == vocales (0,1,2,3,4)) {
                total ++;
            }
        }               
    }
}
