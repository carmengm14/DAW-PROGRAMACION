import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo5 {
    public static void main(String[] args) throws IOException{
    
            String text = "Contenido para el fichero.";
            String nomFich = "f4.txt";
            FileOutputStream f_out = new FileOutputStream("/home/alumno/Documentos/f/" + nomFich, true);
            for (int i = 0; i < text.length(); i++) {
                f_out.write(text.charAt(i));
            }
            System.out.println("");
            f_out.close();
    }
}
