package ejemplos;
//Copia el contenido de f13 en un fichero que crea con otro formato.
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Ejemplo14 {
    public static void main(String[] args) throws IOException{
        String nomFich = "f13.txt";
        String nomFich2 = "f13_ISO.txt";

        BufferedReader f_ent = new BufferedReader(new FileReader("/home/alumno/Documentos/f/" + nomFich));
        
        PrintWriter f_sal = new PrintWriter(new OutputStreamWriter(new FileOutputStream("/home/alumno/Documentos/f/" + nomFich2), "ISO-8859-1"));

        String cad = f_ent.readLine();
        while (cad != null) {
            f_sal.println(cad);
            cad = f_ent.readLine();
        }
        f_ent.close();
        f_sal.close();
    }
}
