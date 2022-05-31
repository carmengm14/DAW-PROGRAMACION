import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Realiza un programa que diga el número de veces que se repite una palabra determinada en un fichero. Tanto el nombre 
del fichero como la palabra se deben pasar como argumentos en la línea de comandos.
*/

public class CuentaPalabras {
    public static void main(String[] args) throws IOException {
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el nombre o ruta del fichero que quieres = ");
        // String fichero = sc.nextLine();

        System.out.print("Escribe la palabra que a contar = ");
        String palabra = sc.nextLine();

        // BufferedReader lector = new BufferedReader(new FileReader(fichero));
        BufferedReader lector = new BufferedReader(new FileReader("porMiCuenta\\CuentaPalabras.java"));

        String cadena = lector.readLine();

        while (cadena != null) {

            String lineaFinal = cadena.trim();

            if (lineaFinal.contains(palabra)) {
                contador++;
            }

            cadena = lector.readLine();
        }

        lector.close();
        System.out.println(palabra + ", se repite = " + contador + " veces.");
        sc.close();

        BufferedWriter escritor = new BufferedWriter(new FileWriter("porMiCuenta\\ficheroDeContador.txt",true));
        escritor.write("La palabra: " + palabra + " se repite = " + contador + " veces.\n");
        escritor.close();
    }
}
