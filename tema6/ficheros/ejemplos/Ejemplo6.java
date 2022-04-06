package tema6.ficheros.ejemplos;
//copia lo que hay en el fichero f5.txt en el fichero f6.txt

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo6 {
    public static void main(String[] args) throws IOException {
        
        String nomFich = "f5.txt";
        String nomFich2 = "f6.txt";

        FileInputStream f_in = new FileInputStream("/home/alumno/Documentos/f/" + nomFich);
        FileOutputStream f_out = new FileOutputStream("/home/alumno/Documentos/f/" + nomFich2);
        
        byte[] buffer = new byte[30];
        int num = f_in.read(buffer);
        while (num != -1){
            f_out.write(buffer);
            num = f_in.read(buffer);
        }
        System.out.println(" ");
        f_in.close();
        f_out.close();
    }
}
