package ejemplos;
//Lee el contenido de f11entrada y lo copia con un estilo en f11salida 
//(teoricamente deberia leerlo y ya pero como elimina el contenido al ejecutar, escribo el contenido con codigo y ya)
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Ejemplo12 {
    public static void main(String[] args) throws IOException{
        
        String nomFich = "f11salida.text";
        String nomFich2 = "f11entrada.text";

        BufferedReader f_ent = new 
        BufferedReader(new FileReader("/home/alumno/Documentos/f/" + nomFich));

        PrintStream f_out = new PrintStream("/home/alumno/Documentos/f/" + nomFich);
        f_out.println("Primera");
        f_out.println("Segunda");
        f_out.println("Tercera");

        PrintWriter f_sal = new PrintWriter(new FileWriter("/home/alumno/Documentos/f/" + nomFich2));

        String cad = f_ent.readLine();
        int i = 0;

        while (cad != null) {
            i++;
            f_sal.println(i + ".- " + cad);
            cad = f_ent.readLine();
        }
        f_ent.close();
        f_sal.close();
        f_out.close();
    }
}
