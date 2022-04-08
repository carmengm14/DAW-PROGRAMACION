import java.io.FileReader;
import java.io.IOException;

public class Ejemplo7 {
   public static void main(String[] args) throws IOException{
        
    String nomFich = "f7.txt";
    FileReader f_in = new FileReader("./tema6/ficheros/f/" + nomFich);
    int c = f_in.read();

    while (c != -1) {
        System.out.print((char) c);
        c = f_in.read();
    }
    System.out.println(" ");
    f_in.close();
} 
}
