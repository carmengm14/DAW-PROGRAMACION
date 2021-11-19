package repasoexamen.ESTRUCTURASCONDICIONALES;
import java.util.Scanner;
/* Escriba un programa que pida al usuario dos palabras, y que indique cuál de ellas es la más larga y por cuántas letras lo es. */

public class PalabraMasLarga {
    public static void main(String[] args) {
        System.out.print("Palabra 1: ");
        Scanner sc = new Scanner(System.in);
        String palabra1 = sc.nextLine();

        System.out.print("Palabra 2: ");
        String palabra2 = sc.nextLine();

        sc.close();
        int conteo1 = palabra1.length(); //esto cuenta numero de letras
        int conteo2 = palabra2.length();

        if (conteo1 > conteo2){
            System.out.printf(" La palabra " + palabra1 + " tiene " + (conteo1-conteo2) + " letras mas que " + palabra2);
          }if (conteo1 < conteo2){
            System.out.printf(" La palabra " + palabra2 + " tiene " + (conteo2-conteo1) + " letras mas que " + palabra1);
          }if(conteo1 == conteo2){
            System.out.printf( "Las dos palabras tienen el mismo largo");
          }
    }
        
}