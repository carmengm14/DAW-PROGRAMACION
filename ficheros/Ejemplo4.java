import java.io.FileInputStream;
import java.io.IOException;

public class Ejemplo4 {
    public static void main(String[] args) throws IOException{
        
        String nomFich = "f3.txt";
        FileInputStream f_in = new FileInputStream("/home/alumno/Documentos/f/" + nomFich);
        byte[] buffer = new byte[30];
        int c = f_in.read(buffer);
        while (c != -1) {
            for (int i = 0; i < c; i++) {
                System.out.print((char) buffer[i]);
            }
            System.out.println("");
            c = f_in.read(buffer);
        }
        f_in.close();
        
    }
}
