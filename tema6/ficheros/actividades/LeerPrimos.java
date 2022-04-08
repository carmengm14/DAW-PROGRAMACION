import java.io.FileInputStream;
import java.io.IOException;

public class LeerPrimos {
    public static void main(String[] args) throws IOException{
        FileInputStream reader = new FileInputStream("./tema6/ficheros/actividades/primos.txt");
        int c = reader.read();
        while (c != -1) {
            System.out.print((char) c);
            c = reader.read();
        }
        System.out.println("");
        reader.close();
    }
}
