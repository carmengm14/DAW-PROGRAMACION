import java.util.Scanner;

public class Ejer38 {
    public static void main(String[] args) {

        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        System.out.print("Dime una palabra: ");
        Scanner sc = new Scanner(System.in);
        String palabra = sc.next();
        sc.close();

        int tamaño = palabra.length();
        int numvocal = 0;

        for (int i = 0; i < tamaño; i++) {
            char caracter = palabra.charAt(i);
            for (int j = 0; j <= i ; j++) {
                if (caracter == vocales[i]) {
                    numvocal++;  
                } 
            }
        }       
        System.out.println("Tienes " + numvocal + " vocales");        
    }
}
