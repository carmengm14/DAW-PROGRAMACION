import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Escribe un programa que guarde en un fichero con nombre "primos.dat" los números primos que hay entre 1 y 500.
public class Primos {
    public static void main(String[] args) throws IOException {
        File f_Out = new File("./tema6/ficheros/actividades/primos.txt");
        FileWriter writer = new FileWriter(f_Out);
        int divisor = 2;
        boolean esPrimo = true;
    
        for (int i = 3; i <= 500; i++) {
            divisor = 2;
            esPrimo = true;
            while ((divisor < i) && esPrimo) {

                if (i % divisor == 0) {
                    esPrimo = false;
                }
                divisor++;
            }
            if (esPrimo == true) {
                //cambiamos los numeros de int a string ya que sino el metodo write no los reconoce y saldran caracteres raros en el fichero
                writer.write((String.valueOf(i + " ")));
                
            }
        }
        writer.close();
    }
}
