/*Realiza un programa que lea el fichero "primos.dat" y muestre los números primos en el terminal.*/
import java.io.FileInputStream;
import java.io.IOException;

public class LeerPrimos {
    public static void main(String[] args) throws IOException{
        FileInputStream reader = new FileInputStream("./tema6/ficheros/actividades/primos.txt");
        int cadena = reader.read();
        while (cadena != -1) {
            System.out.print((char) cadena);
            cadena = reader.read();
        }
        System.out.println("");
        reader.close();
    }
}
