//Guarda text en el fichero f9 que se creara al momento de ejecutar programa
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo10 {
    public static void main(String[] args) throws IOException{
        FileWriter f_out = null;
        String text = "Contenido para el fichero, sin miedo a los caracteres raros: á ç ñ";
        String nomFich = "f9.txt";

        try {
            f_out = new FileWriter("./tema6/ficheros/f/" + nomFich) ;
            for (int i = 0; i < text.length(); i++) {
                f_out.write(text.charAt(i));
            }
        } finally{
            if (f_out != null) {
                f_out.close();       
            }
        }
    }
}