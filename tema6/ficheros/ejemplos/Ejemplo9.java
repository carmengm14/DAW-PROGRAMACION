//lee el archivo f8.txt y lo enseña
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo9 {
    public static void main(String[] args) throws IOException{

        String nomFich = "f8.txt";
        FileReader f_in = new FileReader("./tema6/ficheros/f/" + nomFich);        
        char[] buffer = new char[30];
        int n = f_in.read(buffer);
        
        while (n != -1) {
            for (int i = 0; i < n; i++) {
                System.out.print(buffer[i]);    
            }
            System.out.println(" ");
            n = f_in.read(buffer);
        }
        f_in.close();
    }
}
