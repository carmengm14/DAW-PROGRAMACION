import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
Realiza un programa que diga el número de veces que se repite una palabra determinada en un fichero. Tanto el nombre 
del fichero como la palabra se deben pasar como argumentos en la línea de comandos.
*/
public class ContarPalabras {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el nombre del fichero: ");
        String fichero = sc.nextLine();

        System.out.print("Escribe la palabra: ");
        String palabra = sc.nextLine();
        
       BufferedReader reader = new BufferedReader(new FileReader("./tema6/ficheros/actividades/" + fichero));
       String cadena = reader.readLine();

       String[] cadenaSeparada = cadena.toLowerCase().split(" ");
    
       int contador = 0;

       for (int i = 0; i < cadenaSeparada.length; i++) {
        if (cadenaSeparada[i].equals(palabra.toLowerCase())) {
            contador++;
        }
        reader.readLine();         
       }
        System.out.println("===================");
        System.out.println("Contenido del fichero: \n" + cadena);
        System.out.println("===================");
        System.out.println("En el fichero: " + fichero + "\n" + "La palabra: " + palabra + ", se encuentra: " + contador + " veces.");
       
        reader.close();
        sc.close();
    }
 
}