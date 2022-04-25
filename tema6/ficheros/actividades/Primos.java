import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Escribe un programa que guarde en un fichero con nombre "primos.dat" los números primos que hay entre 1 y 500.
public class Primos {
    public static void main(String[] args) throws IOException {
        File ficheroSalida = new File("./tema6/ficheros/actividades/primos.dat");
        FileWriter writer = new FileWriter(ficheroSalida);
     
        for (int i = 3; i <= 500; i++) {
            if (esPrimo(i) == true) {
                //cambiamos los numeros de int a string ya que sino el metodo write no los reconoce y saldran caracteres raros en el fichero
                writer.write(i + "\n");
                
            }
        }
        writer.close();
    }

    private static boolean esPrimo(int numero) {
        int divisor = 2;
        boolean esPrimo = true;
        while ((divisor < numero) && esPrimo) {
            if (numero % divisor == 0) {
                esPrimo = false;
            }
            divisor++;
        }
        return esPrimo;
    }
}
