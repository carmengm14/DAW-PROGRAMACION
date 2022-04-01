import java.io.FileInputStream;
import java.io.IOException;

public class ejemplo2 {
    public static void main(String[] args) throws IOException {
        String nomFich = "fichero.txt";
        FileInputStream f_in = new FileInputStream("/home/alumno/Documentos/f/" + nomFich);
        int c = f_in.read();
        while (c != -1) {
            System.out.println((char) c);
            c = f_in.read();
        }
        f_in.close();
    }    
}
