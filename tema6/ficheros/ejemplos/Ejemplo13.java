//Lee el contenido del fichero f12 y lo copia con otro formato en el fichero f12_ISO
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ejemplo13 {
    public static void main(String[] args) throws IOException{
        String nomFich = "f12.txt";
        String nomFich2 = "f12_ISO.txt";

        InputStreamReader f_ent = new InputStreamReader(new FileInputStream("/home/alumno/Documentos/f/" + nomFich), "UTF-8");
        OutputStreamWriter f_sal = new OutputStreamWriter(new FileOutputStream("/home/alumno/Documentos/f/" + nomFich2), "ISO-8859-1");

        int car = f_ent.read();
        while (car != -1) {
            f_sal.write(car);
            car = f_ent.read();
        }
        f_ent.close();
        f_sal.close();
    }
}
